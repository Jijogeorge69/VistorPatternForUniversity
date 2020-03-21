package com.university.visitor.pattern;

import com.university.composite.pattern.College;
import com.university.composite.pattern.Department;
import com.university.composite.pattern.OrganizationComponent;
import com.university.composite.pattern.University;

public class Person {

	private String first_name;
	private String last_name;
	private String id;
	private String email;
	private String phone_number;
	private Address address;

	protected OrganizationComponent setPersonOrg(String UniversityName, String CollegeName, String DepartmentName) {

		OrganizationComponent university = new University(UniversityName);
		OrganizationComponent engineeringCollege = new College(CollegeName);
		engineeringCollege.add(new Department(DepartmentName));

		university.add(engineeringCollege);
		return university;
	}

	public Person(String first_name, String last_name, String id, String email, String phone_number, Address address) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
		this.email = email;
		this.phone_number = phone_number;
		this.address = address;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
