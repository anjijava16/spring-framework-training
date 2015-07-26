package com.skbr;

public class Car {

	@Override
	public String toString() {
		return "This is a car";
	}

	public static class Engine {
		@Override
		public String toString() {
			return "This is an engine";
		}
	}
}
