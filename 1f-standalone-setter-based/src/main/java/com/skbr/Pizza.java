package com.skbr;

public class Pizza {
	
	private String type;
	private Topping topping;
	private Crust crust;
	
	public void setType(String type) {
		this.type = type;
	}

	public void setTopping(Topping topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "Pizza [type=" + type + ", topping=" + topping + ", crust=" + crust + "]";
	}
}
