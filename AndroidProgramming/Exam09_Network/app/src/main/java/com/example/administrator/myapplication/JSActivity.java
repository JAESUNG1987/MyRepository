package com.example.administrator.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

public class JSActivity extends AppCompatActivity {
    private ImageView imageLarge;
    private ListView foodList;
    private FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_js);

        imageLarge = (ImageView) findViewById(R.id.imageLarge);

        foodList = (ListView) findViewById(R.id.foodList);
        foodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Food food = (Food) foodAdapter.getItem(position);
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        final Bitmap bitmap = getBitmap(food.getImageLargeFileName());
                        imageLarge.post(new Runnable() {
                            @Override
                            public void run() {
                                imageLarge.setImageBitmap(bitmap);
                            }
                        });
                    }
                };
                thread.start();
            }
        });
        fillItems();
    }

    private void fillItems() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    URL url = new URL("http://192.168.0.85:8080/myandroid/foodList");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.connect();

                    if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                        InputStream is = conn.getInputStream();
                        Reader reader = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(reader);
                        String strJson = "";
                        while(true) {
                            String data = br.readLine();
                            if(data == null) break;
                            strJson += data;
                        }
                        br.close(); reader.close(); is.close();
                        final List<Food> list = parseJson(strJson);
                        foodList.post(new Runnable() {
                            @Override
                            public void run() {

                                foodAdapter = new FoodAdapter(JSActivity.this);
                                foodAdapter.setList(list);
                                foodList.setAdapter(foodAdapter);
                                imageLarge.setImageBitmap(list.get(0).getImageLarge());
                            }
                        });
                    }

                    conn.disconnect();
                } catch (Exception e) {
                    Log.i("mylog", e.getMessage());
                }
            }
        };
        thread.start();
    }

    public List<Food> parseJson(String strJson) {
        List<Food> list = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(strJson);
            for(int i=0; i<jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Food food = new Food();
                food.setImage(getBitmap(jsonObject.getString("image")));
                if(i==0) {
                    food.setImageLarge(getBitmap(jsonObject.getString("imageLarge")));
                }
                food.setImageFileName(jsonObject.getString("image"));
                food.setImageLargeFileName(jsonObject.getString("imageLarge"));
                food.setFoodNameTitle(jsonObject.getString("foodNameTitle"));
                food.setFoodPriceTitle(jsonObject.getString("foodPriceTitle"));
                food.setFoodContent(jsonObject.getString("foodContent"));
                list.add(food);
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


}
