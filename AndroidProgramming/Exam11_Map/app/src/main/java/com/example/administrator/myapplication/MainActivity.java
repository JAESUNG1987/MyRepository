package com.example.administrator.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private ImageView imageLarge;
    private ToggleButton btnList, btnMap;
    private FrameLayout frameLayout;

    private ListView lightList;
    private LightAdapter lightAdapter;

    private LinearLayout mapContainer;
    private SupportMapFragment mapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageLarge = (ImageView) findViewById(R.id.imageLarge);
        btnList = (ToggleButton) findViewById(R.id.btnList);
        btnList.setOnClickListener(buttonClickListener);
        btnMap = (ToggleButton) findViewById(R.id.btnMap);
        btnMap.setOnClickListener(buttonClickListener);
        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);


        lightList = (ListView) findViewById(R.id.lightList);
        lightList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            final Light light = (Light) lightAdapter.getItem(position);
            AsyncTask<Void, Void, Bitmap> asyncTask = new AsyncTask<Void, Void, Bitmap>() {
                @Override
                protected Bitmap doInBackground(Void... params) {
                    return getBitmap(light.getImageLargeFileName());
                }

                @Override
                protected void onPostExecute(Bitmap bitmap) {
                    imageLarge.setImageBitmap(bitmap);
                }
            };
            asyncTask.execute();

            }
        });
        testAsyncTask();
        fillItems();
        mapContainer = (LinearLayout) findViewById(R.id.mapContaniner);
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapFragment);
        mapFragment.getMapAsync(this);

        btnList.setChecked(true);
        lightList.setVisibility(View.VISIBLE);
        mapContainer.setVisibility(View.INVISIBLE);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == btnList){
                Log.i("mylog", "btnList 클릭");
                btnMap.setChecked(false);
                lightList.setVisibility(View.VISIBLE);
                mapContainer.setVisibility(View.INVISIBLE);
            } else if (v == btnMap) {
                Log.i("mylog", "btnMap 클릭");
                btnList.setChecked(false);
                lightList.setVisibility(View.INVISIBLE);
                mapContainer.setVisibility(View.VISIBLE);
            }
        }
    };

    public void testAsyncTask() {
        Log.i("mylog", "1:" + Thread.currentThread().getName());
        AsyncTask<String, Integer, String> asyncTask = new AsyncTask<String, Integer, String>() {
            @Override
            protected String doInBackground(String... params) {
                Log.i("mylog", "2:" + Thread.currentThread().getName());
                Log.i("mylog", params[0]);
                Log.i("mylog", params[1]);
                Log.i("mylog", params[2]);

                for (int i = 1; i <= 100; i++) {
                    if (i == 1) {
                        publishProgress(1);
                    } else if (i == 50) {
                        publishProgress(50);
                    } else if (i == 100) {
                        publishProgress(100);
                    }
                }

                return "작업스레드결과";
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                Log.i("mylog", "3:" + Thread.currentThread().getName());
                Log.i("mylog", "작업진행정도:" + values[0]);
            }

            @Override
            protected void onPostExecute(String aVoid) {
                Log.i("mylog", "4:" + Thread.currentThread().getName());
                Log.i("mylog", aVoid);
            }
        };
        asyncTask.execute("실행매게값1", "실행매게값2", "실행매게값3");
    }

    private void fillItems() {
        AsyncTask<Void, Void, List<Light>> asyntask = new AsyncTask<Void, Void, List<Light>>() {
            @Override
            protected List<Light> doInBackground(Void... params) {
                List<Light> list = null;
                try {
                    URL url = new URL("http://192.168.0.85:8080/myandroid/lightList");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.connect();

                    if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                        InputStream is = conn.getInputStream();
                        Reader reader = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(reader);
                        String strJson = "";
                        while (true) {
                            String data = br.readLine();
                            if (data == null) break;
                            strJson += data;
                        }
                        br.close();
                        reader.close();
                        is.close();
                        list = parseJson(strJson);
                    }

                    conn.disconnect();
                }catch (Exception e) {
                    Log.i("mylog", e.getMessage());
                }
                return list;
            }

            @Override
            protected void onPostExecute(List<Light> lights) {
                lightAdapter = new LightAdapter(MainActivity.this);
                lightAdapter.setList(lights);
                lightList.setAdapter(lightAdapter);
                imageLarge.setImageBitmap(lights.get(0).getImageLarge());
            }
        };
        asyntask.execute();
    }

    public List<Light> parseJson(String strJson) {
        List<Light> list = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(strJson);
            for(int i=0; i<jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Light light = new Light();
                light.setImage(getBitmap(jsonObject.getString("image")));
                if(i==0) {
                    light.setImageLarge(getBitmap(jsonObject.getString("imageLarge")));
                }
                light.setImageFileName(jsonObject.getString("image"));
                light.setImageLargeFileName(jsonObject.getString("imageLarge"));
                light.setTitle(jsonObject.getString("title"));
                light.setContent(jsonObject.getString("content"));
                list.add(light);
            }
        } catch (JSONException e) {
            Log.i("mylog", e.getMessage());
        }
        return list;
    }

    public Bitmap getBitmap(String fileName) {
        Bitmap bitmap = null;
        try {
            URL url = new URL("http://192.168.0.85:8080/myandroid/getImage?fileName=" + fileName);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();

            if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream is = conn.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);
            }

            conn.disconnect();
        } catch (Exception e) {
            Log.i("mylog", e.getMessage());
        }
        return bitmap;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng = new LatLng(37.495229, 127.122274);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15));
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("IT 벤처타워");
        googleMap.addMarker(markerOptions);
    }
}
