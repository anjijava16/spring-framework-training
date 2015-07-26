package com.skbr;

import java.util.Set;

public class Teacher {
	
	private Set<Student> students;

	public Teacher(Set<Student> students) {
		super();
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [students=" + students + "]";
	}
	
	

}
