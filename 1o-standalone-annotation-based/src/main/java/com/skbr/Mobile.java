package com.skbr;

import org.springframework.beans.factory.annotation.Autowired;

public class Mobile {

	@Autowired
	private Battery battery;

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [battery=" + battery + "]";
	}
	
	
}
