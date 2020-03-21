package com.university.visitor.pattern;

public interface UniversityVisitor {

	public int calculateCountOf(Student students);

	public int calculateCountOf(Staff staff);

	public int calculateCountOf(Faculty faculty);

}
