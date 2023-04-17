package com.aditya.hotelManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {
	
	@Id
	@GeneratedValue
	@Column
	private long hotleId;
	
	@Column
	private String hotelName;
	
	@Column
	private String hotelAddress;
	
	@Column
	private String hotelCity;
	
	@Column
	private int rating;
	
	public Hotel() {
		
	}
	
	public Hotel(long hotleId, String hotelName, String hotelAddress, String hotelCity, int rating) {
		super();
		this.hotleId = hotleId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.hotelCity = hotelCity;
		this.rating = rating;
	}
	
	public long getHotleId() {
		return hotleId;
	}

	public void setHotleId(long hotleId) {
		this.hotleId = hotleId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


}
