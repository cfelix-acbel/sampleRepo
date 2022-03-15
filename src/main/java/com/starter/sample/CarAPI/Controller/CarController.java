package com.starter.sample.CarAPI.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starter.sample.CarAPI.Model.Car;
import com.starter.sample.CarAPI.Service.CarService;

@RestController
@RequestMapping("/api/car")
public class CarController {
	
	private CarService carService;

	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}
	
	@PostMapping
	public ResponseEntity<Car> saveCar(@RequestBody Car car){
		return new ResponseEntity<Car>(carService.saveCar(car),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Car> displayCars(){
		return carService.getAllCars();
		
	}
}
