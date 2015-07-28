package com.skbr;

public class EmployeeDirectoryService {

	private EmployeeDao employeeDao;


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}


	@Override
	public String toString() {
		return "EmployeeDirectoryService [employeeDao=" + employeeDao + "]";
	}
}
