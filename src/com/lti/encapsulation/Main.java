package com.lti.encapsulation;

public class Main {

	public static void main(String[] args) {
		/*Product pro=new Product();
		pro.display();
		pro.features();*/
		/*Employee emp=new Employee();
		Employee emp1=new Employee(123,"Parth","GET2");
		emp1.display();*/
		Course c=new Course(101,"java full stack",45000.55f);
		Course c1=new Course(101,"python full stack",50000.55f);
		Student s=new Student(1,"Parth",c);
		Student s1=new Student(1,"Aryan",c1);

		s.showDetails();
		s1.showDetails();

	}

}
