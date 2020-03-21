package com.university.visitor.pattern;

import com.university.composite.pattern.OrganizationComponent;

public class RunMain {

	public static void main(String[] args) {
		Address add = new Address("3600", "Lancaster", "Phily", "PA", "19104", "USA");

		Person person = new Person("Jijo", "George", "0830", "Jg3686@drexel.edu", "2676933543", add);
		OrganizationComponent og = person.setPersonOrg("Drexel University", "College of Engineering",
				"College of Computing and Informatics");
		Student std = new Student(person.getFirst_name(), person.getLast_name(), person.getId(), person.getEmail(),
				person.getPhone_number(), person.getAddress(), 4.0, og);

		System.out.println("Student details are as follows:-");
		System.out.println("Students First Name:-" + std.getFirst_name());
		System.out.println("Students Last Name:-" + std.getLast_name());
		System.out.println("Students GPA:-" + std.getGpa());
		System.out.println("Students Org Unit Hierarchy");
		System.out.println("*******************************************************************");
		og.print();
		System.out.println("*******************************************************************");

	}
}
