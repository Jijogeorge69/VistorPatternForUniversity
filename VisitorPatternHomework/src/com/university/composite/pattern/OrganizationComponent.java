package com.university.composite.pattern;

/*
@author: Jijo George
@title: Composite Design Pattern Implementation
@type : Component
*/

public abstract class OrganizationComponent {

	private String name;

	public OrganizationComponent(String name) {
		this.name = name;
	}

	public abstract void add(OrganizationComponent organizationComponent);

	public abstract void remove(OrganizationComponent organizationComponent);

	public abstract void print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
