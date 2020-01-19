package com.exercise13oopstatic.model;

public class Car {

	private String serialNumber;
	private int numberDoors;
	private boolean isCoupe = false;
	private String brand;
	
	public Car() {
		
	}
	
	public Car(String serialNumber, int numberDoors) {
		this.serialNumber = serialNumber;
		this.numberDoors = numberDoors;
		
	}
	
	//Getters and Setters
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public int getNumberDoors() {
		return numberDoors;
	}
	
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void CarIsCoupe(boolean isCoupe) {
		this.isCoupe = isCoupe;
		
		if (this.isCoupe) this.numberDoors = 2;
	}
	
	public String toString() {
		return "Serial Number "+this.serialNumber+" Number Doors "+this.numberDoors+" Is Coupe "+this.isCoupe+" Brand "+this.brand+"";
	}

}
