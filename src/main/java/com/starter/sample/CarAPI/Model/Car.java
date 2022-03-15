package com.starter.sample.CarAPI.Model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long CarID;
	
	@Column(name = "Car_Model")
	private String CarModel;
	@Column(name = "Car_Brand")
	private String CarBrand;
	@Column(name = "Car_Type")
	private String CarType;
	public long getCarID() {
		return CarID;
	}
	public void setCarID(long carID) {
		CarID = carID;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public String getCarBrand() {
		return CarBrand;
	}
	public void setCarBrand(String carBrand) {
		CarBrand = carBrand;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}		
	
	
}
