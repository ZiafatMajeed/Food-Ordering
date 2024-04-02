package com.ziafat_majeed.pizzawissa.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity

public class  Products {

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("subCategory")
	private String subCategory;

	@SerializedName("discountedPrice")
	private int discountedPrice;

	@SerializedName("price")
	private int price;

	@SerializedName("name")
	private String name;

	@SerializedName("rating")
	private int rating;

	@SerializedName("details")
	private String details;
@PrimaryKey
	@SerializedName("id")
	private int id;

	@SerializedName("shortDescription")
	private String shortDescription;

	@SerializedName("category")
	private String category;

	@SerializedName("picture")
	private String picture;

	@SerializedName("updatedAt")
	private String updatedAt;

	public String getCreatedAt(){
		return createdAt;
	}

	public String getSubCategory(){
		return subCategory;
	}

	public int getDiscountedPrice(){
		return discountedPrice;
	}

	public int getPrice(){
		return price;
	}

	public String getName(){
		return name;
	}

	public int getRating(){
		return rating;
	}

	public String getDetails(){
		return details;
	}

	public int getId(){
		return id;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public String getCategory(){
		return category;
	}

	public String getPicture(){
		return picture;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}
}