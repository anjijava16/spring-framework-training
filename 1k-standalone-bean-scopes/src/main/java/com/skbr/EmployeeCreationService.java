package com.skbr;

public class EmployeeCreationService {

	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public String toString() {
		return "EmployeeCreationService [employeeDao=" + employeeDao + "]";
	}
	
	
}
