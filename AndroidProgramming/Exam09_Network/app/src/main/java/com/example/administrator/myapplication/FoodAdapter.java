package com.example.administrator.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends BaseAdapter{
    private List<Food> list;
    public void setList(List<Food> list) {
        this.list = list;
    }

    private Context context;
    private LayoutInflater layoutInflater;

    public FoodAdapter(Context context){
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            //inplation
            convertView = layoutInflater.inflate(R.layout.food_item, null);
        }
        Food food = list.get(position);

        ImageView foodimage = (ImageView) convertView.findViewById(R.id.foodImage);
        foodimage.setImageBitmap(food.getImage());

        TextView foodNameTitle = (TextView) convertView.findViewById(R.id.foodNameTitle);
        foodNameTitle.setText(food.getFoodNameTitle());

        TextView foodPriceTitle = (TextView) convertView.findViewById(R.id.foodPriceTitle);
        foodPriceTitle.setText(food.getFoodPriceTitle());

        TextView foodContent = (TextView) convertView.findViewById(R.id.foodContent);
        foodContent.setText(food.getFoodContent());

        return convertView;
    }
}
