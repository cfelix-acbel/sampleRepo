package com.starter.sample.CarAPI.Service;

import java.util.List;

import com.starter.sample.CarAPI.Model.Car;

public interface CarService {
	 Car saveCar(Car car);
     List<Car> getAllCars();
}
