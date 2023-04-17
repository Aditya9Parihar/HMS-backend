package com.aditya.hotelManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.hotelManagementSystem.entity.Hotel;


public interface HotelRepo extends JpaRepository<Hotel, Integer>{
	
	List<Hotel> findByHotelNameIgnoreCase(String hotelName);

	List<Hotel> findByHotelCity(String city);
}
