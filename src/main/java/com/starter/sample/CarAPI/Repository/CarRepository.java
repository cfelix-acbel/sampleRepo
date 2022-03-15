package com.starter.sample.CarAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starter.sample.CarAPI.Model.Car;

public interface CarRepository extends JpaRepository<Car, Long>{

}
