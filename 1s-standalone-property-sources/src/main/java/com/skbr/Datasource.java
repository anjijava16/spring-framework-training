package com.skbr;

public class Datasource {
	
	private String database;

	public void setDatabase(String database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "Datasource [database=" + database + "]";
	}
}
