package com.skbr;

public class Mobile {
	
	private Battery battery;

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [battery=" + battery + "]";
	}
}
