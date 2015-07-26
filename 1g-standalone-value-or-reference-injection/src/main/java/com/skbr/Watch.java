package com.skbr;

public class Watch {
	
	private String brand;
	private int cost;
	private boolean digital;
	private String color;
	private Battery battery;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", cost=" + cost + ", digital=" + digital + ", color=" + color + ", battery="
				+ battery + "]";
	}
}
