package com.university.visitor.pattern;

import com.university.composite.pattern.OrganizationComponent;

public class Staff extends Person implements Visitable {

	private int salary;
	private OrganizationComponent orgComponent;

	public Staff(String first_name, String last_name, String id, String email, String phone_number, Address address,
			int salary, OrganizationComponent orgComponent) {
		super(first_name, last_name, id, email, phone_number, address);
		this.salary = salary;
		this.orgComponent = orgComponent;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int accept(UniversityVisitor visitor) {
		return visitor.calculateCountOf(this);
	}

	@Override
	public int acceptStudent(StudentVisitor visitor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
