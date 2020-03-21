package com.university.visitor.pattern;

import com.university.composite.pattern.OrganizationComponent;

public class Student extends Person implements Visitable {

	private double gpa;
	private OrganizationComponent orgComponent;

	public Student(String first_name, String last_name, String id, String email, String phone_number, Address address,
			double gpa, OrganizationComponent orgComponent) {
		super(first_name, last_name, id, email, phone_number, address);
		this.gpa = gpa;
		this.orgComponent = orgComponent;
	}

	public Student() {
		super();
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int accept(UniversityVisitor visitor) {

		return visitor.calculateCountOf(this);
	}

	@Override
	public int acceptStudent(StudentVisitor visitor) {
		return (int) visitor.calculateaverageGPA(this);
	}

}
