package com.starter.sample.CarAPI.ServiceImpl;

import org.springframework.stereotype.Service;

import com.starter.sample.CarAPI.Model.Car;
import com.starter.sample.CarAPI.Repository.CarRepository;
import com.starter.sample.CarAPI.Service.CarService;
@Service
public class CarServiceImpl implements CarService{

	CarRepository carRepo;
	
	
	public CarServiceImpl(CarRepository carRepo) {
		super();
		this.carRepo = carRepo;
	}


	@Override
	public Car saveCar(Car car) {
		return carRepo.save(car);
	}







	
}
