package com.university.composite.pattern;

import java.util.LinkedList;
import java.util.List;

/*
@author: Jijo George
@title: Composite Design Pattern Implementation
@type : Composite
*/

public class University extends OrganizationComponent {
	List<OrganizationComponent> organizationComponents = new LinkedList<>();

	public University(String name) {
		super(name);
	}

	@Override
	public void add(OrganizationComponent organizationComponent) {
		organizationComponents.add(organizationComponent);
	}

	@Override
	public void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}

	@Override
	public void print() {
		System.out.println("--------------" + getName() + "--------------");

		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}

}
