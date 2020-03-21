package com.university.composite.pattern;

public class Main {

	public static void main(String[] args) {
		// University
		OrganizationComponent university = new University("Drexel University");

		// College
		OrganizationComponent infoEngineeringCollege = new College("College of Engineering");

		// Department
		infoEngineeringCollege.add(new Department("Electronic Engineering Department"));
		infoEngineeringCollege.add(new Department("Mechanical Engineering Department"));
		infoEngineeringCollege.add(new Department("College of Computing and Informatics"));

		university.add(infoEngineeringCollege);
		university.print();

	}

}
