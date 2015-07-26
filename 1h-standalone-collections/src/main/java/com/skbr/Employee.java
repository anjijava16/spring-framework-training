package com.skbr;

import java.util.List;

public class Employee {
	
	private List<String> emailAddressList;
	
	public void setEmailAddressList(List<String> emailAddressList) {
		this.emailAddressList = emailAddressList;
	}

	@Override
	public String toString() {
		return "Employee [emailAddressList=" + emailAddressList + "]";
	}
}
