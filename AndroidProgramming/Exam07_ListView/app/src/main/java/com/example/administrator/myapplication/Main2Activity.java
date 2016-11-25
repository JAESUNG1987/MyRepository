package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private LinearLayout foodContainer;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        foodContainer = (LinearLayout) findViewById(R.id.foodContainer);
        layoutInflater = getLayoutInflater();

        fillItems();

    }

    public void fillItems(){
        int[] arrImage = {
            R.drawable.food01,
            R.drawable.food02,
            R.drawable.food03,
            R.drawable.food04,
            R.drawable.food05,
            R.drawable.food01,
            R.drawable.food02,
            R.drawable.food03,
            R.drawable.food04,
            R.drawable.food05

        };
        String[] arrNameTitle = {
            "Name01",
            "Name02",
            "Name03",
            "Name04",
            "Name05",
            "Name01",
            "Name02",
            "Name03",
            "Name04",
            "Name05"
        };
        String[] arrPriceTitle = {
            "35,000 Won",
            "40,000 Won",
            "45,000 Won",
            "50,000 Won",
            "55,000 Won",
            "35,000 Won",
            "40,000 Won",
            "45,000 Won",
            "50,000 Won",
            "55,000 Won"
        };
        String[] arrContent = {
                "Information about popular Korean food dishes and local restaurant listings in the Tri-state area.",
                "akjshdahsdkjahskjdhajksh ashdkj ahsdkjhaskjdhaksjhdkjah jkshd",
                "ajsdhjajagd  askjdhka jshd asdjhkjasd kjasdhkja h",
                "ajshdjgasdasjhgdahsd",
                "akshdag",
                "Information about popular Korean food dishes and local restaurant listings in the Tri-state area.",
                "akjshdahsdkjahskjdhajksh ashdkj ahsdkjhaskjdhaksjhdkjah jkshd",
                "ajsdhjajagd  askjdhka jshd asdjhkjasd kjasdhkja h",
                "ajshdjgasdasjhgdahsd",
                "akshdag"
        };
        for(int i=0; i<10; i++){
            LinearLayout foodLayout = (LinearLayout)layoutInflater.inflate(R.layout.food_item, null);

            ImageView foodImage = (ImageView) foodLayout.findViewById(R.id.foodImage);
            foodImage.setImageResource(arrImage[i]);

            TextView foodNameTitle = (TextView)foodLayout.findViewById(R.id.foodNameTitle);
            foodNameTitle.setText(arrNameTitle[i]);

            TextView foodPriceTitle = (TextView) foodLayout.findViewById(R.id.foodPriceTitle);
            foodPriceTitle.setText(arrPriceTitle[i]);

            TextView foodContent = (TextView) foodLayout.findViewById(R.id.foodContent);
            foodContent.setText(arrContent[i]);

            foodContainer.addView(foodLayout);
        }

    }
}
