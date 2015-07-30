package com.skbr.beans;

import javax.inject.Inject;
import javax.inject.Named;

public class Mobile {
	
	@Inject
	@Named(value="lithium")
	private Battery battery;

	@Override
	public String toString() {
		return "Mobile [battery=" + battery + "]";
	}
	
	private void init() {
		System.out.println("Initializing mobile");
	}
}
