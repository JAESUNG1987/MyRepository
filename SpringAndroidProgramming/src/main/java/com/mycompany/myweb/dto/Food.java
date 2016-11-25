package com.mycompany.myweb.dto;

public class Food {
	private String image;
    private String imageLarge;
    private String foodNameTitle;
    private String foodPriceTitle;
    private String foodContent;
    
    public Food() {}

	public Food(String image, String imageLarge, String foodNameTitle, String foodPriceTitle, String foodContent) {
		this.image = image;
		this.imageLarge = imageLarge;
		this.foodNameTitle = foodNameTitle;
		this.foodPriceTitle = foodPriceTitle;
		this.foodContent = foodContent;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImageLarge() {
		return imageLarge;
	}

	public void setImageLarge(String imageLarge) {
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
