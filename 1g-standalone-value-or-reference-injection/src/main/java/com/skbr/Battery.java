package com.skbr;

public class Battery {
	
	private String type;

	public Battery(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Battery [type=" + type + "]";
	}
	

}
