package com.university.visitor.pattern;

public class StudentVisitorImpl implements StudentVisitor {

	@Override
	public double calculateaverageGPA(Student student) {

		return student.getGpa();
	}

}
