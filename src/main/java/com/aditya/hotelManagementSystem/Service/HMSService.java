package com.aditya.hotelManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.hotelManagementSystem.dao.HotelRepo;
import com.aditya.hotelManagementSystem.entity.Hotel;



@Service
public class HMSService {
	
	@Autowired
	public HotelRepo hmsRepo;
	
	public Hotel saveHotel(Hotel hotel) {
		return hmsRepo.save(hotel);
	}
	
	public List<Hotel> getAllHotels(){
		return hmsRepo.findAll();
	}
	
	public List<Hotel> getHotelByName(String hotelName){
		return hmsRepo.findByHotelNameIgnoreCase(hotelName);
	}
	
	public List<Hotel> getHotelByCity(String city){
		return hmsRepo.findByHotelCity(city);
	}

	

}
