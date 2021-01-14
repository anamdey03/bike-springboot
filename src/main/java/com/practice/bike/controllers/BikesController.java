package com.practice.bike.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bike.models.Bike;
import com.practice.bike.repositories.BikeRepository;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {
	
	@Autowired
	private BikeRepository bikeRepository;

	
	@GetMapping
	public List<Bike> bikeList() {
		return bikeRepository.findAll();
 	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void createBike(@RequestBody Bike bike) {
		bikeRepository.save(bike);
	}
	
	@GetMapping("/{id}")
	public Bike getBike(@PathVariable("id") long id) {
		return bikeRepository.getOne(id);
	}
}
