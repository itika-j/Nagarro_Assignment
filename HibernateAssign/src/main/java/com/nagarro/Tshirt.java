package com.nagarro;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Tshirt Model
@Entity
@Table(name = "tshirt")
public class Tshirt {
	@Id
	private String id;
	private String name;
	private String colour;
	private String gender_recommendation;
	private String size;
	private float price;
	private float rating;
	private String availability;

	public Tshirt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender_recommendation() {
		return gender_recommendation;
	}

	public void setGender_recommendation(String gender_recommendation) {
		this.gender_recommendation = gender_recommendation;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public Tshirt(String id, String name, String colour, String gender_recommendation, String size, float price,
			float rating, String availability) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.gender_recommendation = gender_recommendation;
		this.size = size;
		this.price = price;
		this.rating = rating;
		this.availability = availability;
	}

}
