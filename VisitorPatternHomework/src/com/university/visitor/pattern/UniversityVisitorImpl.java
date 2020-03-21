package com.university.visitor.pattern;

public class UniversityVisitorImpl implements UniversityVisitor {
	private int studentCount = 0;
	private int staffCount = 0;
	private int facultyCount = 0;

	@Override
	public int calculateCountOf(Student students) {
		studentCount++;
		return studentCount;
	}

	@Override
	public int calculateCountOf(Staff staff) {
		staffCount++;
		return staffCount;
	}

	@Override
	public int calculateCountOf(Faculty faculty) {
		facultyCount++;
		return facultyCount;
	}

}
