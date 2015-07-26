package com.skbr;

import java.util.Map;

public class EmployeeDirectory {
	
	private Map<Integer, String> idToNameMap;

	public void setIdToNameMap(Map<Integer, String> idToNameMap) {
		this.idToNameMap = idToNameMap;
	}

	@Override
	public String toString() {
		return "EmployeeDirectory [idToNameMap=" + idToNameMap + "]";
	}
}
