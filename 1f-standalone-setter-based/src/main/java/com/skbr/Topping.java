package com.skbr;

public class Topping {
	
	private String type;

	public Topping(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Topping [type=" + type + "]";
	}
}
