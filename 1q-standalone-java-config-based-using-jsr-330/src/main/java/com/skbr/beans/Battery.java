package com.skbr.beans;

public class Battery {

	@Override
	public String toString() {
		return "Battery []";
	}

	private void destroy() {
		System.out.println("Destroying battery");
	}
}
