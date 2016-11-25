package com.example.administrator.myapplication;

import android.graphics.Bitmap;

public class Food {
    private Bitmap image;
    private Bitmap imageLarge;
    private String imageFileName;
    private String imageLargeFileName;

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getImageLargeFileName() {
        return imageLargeFileName;
    }

    public void setImageLargeFileName(String imageLargeFileName) {
        this.imageLargeFileName = imageLargeFileName;
    }

    private String foodNameTitle;
    private String foodPriceTitle;
    private String foodContent;

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Bitmap getImageLarge() {
        return imageLarge;
    }

    public void setImageLarge(Bitmap imageLarge) {
        this.imageLarge = imageLarge;
    }

    public String getFoodNameTitle() {
        return foodNameTitle;
    }

    public void setFoodNameTitle(String foodNameTitle) {
        this.foodNameTitle = foodNameTitle;
    }

    public String getFoodPriceTitle() {
        return foodPriceTitle;
    }

    public void setFoodPriceTitle(String foodPriceTitle) {
        this.foodPriceTitle = foodPriceTitle;
    }

    public String getFoodContent() {
        return foodContent;
    }

    public void setFoodContent(String foodContent) {
        this.foodContent = foodContent;
    }
}
