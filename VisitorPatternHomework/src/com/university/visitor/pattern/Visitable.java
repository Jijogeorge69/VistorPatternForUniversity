package com.university.visitor.pattern;

public interface Visitable {

	public int accept(UniversityVisitor visitor);

	public int acceptStudent(StudentVisitor visitor);

}
