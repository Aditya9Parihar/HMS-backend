package com.aditya.hotelManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.hotelManagementSystem.Service.HMSService;
import com.aditya.hotelManagementSystem.entity.Hotel;


@RestController
@RequestMapping("/hotelManagementSystem")
@CrossOrigin(origins = "*")
public class HMSController {
	
	@Autowired
	public HMSService hmsService;
	
	@PostMapping("/createHotel")
	public Hotel createCustomer(@RequestBody Hotel hotel) {
		return hmsService.saveHotel(hotel);
	}
	
	@GetMapping("/getHotelByName/{name}")
	public List<Hotel> getHotelByName (@PathVariable String name){
		return hmsService.getHotelByName(name);
	}
	
	@GetMapping("/getHotelByCity/{city}")
	public List<Hotel> getHotelByCity(@PathVariable String city){
		return hmsService.getHotelByCity(city);
	}
	
	@GetMapping("/getAllHotels")
	public List<Hotel> getAllHotels(){
		return hmsService.getAllHotels();
	}
}
