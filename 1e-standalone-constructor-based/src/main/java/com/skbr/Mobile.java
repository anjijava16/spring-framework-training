package com.skbr;

public class Mobile {
	
	private String brand;
	private String color;
	private Battery battery;
	

	public Mobile(String brand, String color, Battery battery) {
		this.brand = brand;
		this.color = color;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", color=" + color + ", battery=" + battery + "]";
	}
}
