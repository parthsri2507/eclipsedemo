package com.lti.main;

import com.lti.entities.Student;

public class Main {

	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student(1,"parth","btech");
		s.setId(1);
		System.out.println(s.getId());
	}

}
