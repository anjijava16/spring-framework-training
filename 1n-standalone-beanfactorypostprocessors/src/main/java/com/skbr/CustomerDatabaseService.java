package com.skbr;

public class CustomerDatabaseService {

	private String database;
	private String username;
	private String password;
	
	public void setDatabase(String database) {
		this.database = database;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerDatabaseService [database=" + database + ", username=" + username + ", password=" + password
				+ "]";
	}
}
