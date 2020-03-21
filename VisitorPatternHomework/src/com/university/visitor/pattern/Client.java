package com.university.visitor.pattern;

import com.university.composite.pattern.OrganizationComponent;

public class Client {

	public static int calculateCount(Visitable[] vs) {
		UniversityVisitorImpl uImpl = new UniversityVisitorImpl();
		int sum = 0;
		int countStudent = 0;
		int countStaff = 0;
		int countFaculty = 0;

		Student stud = new Student();
		Faculty fc = new Faculty();
		Staff stf = new Staff();
		for (Visitable vis : vs) {
			if (vis.getClass() == stud.getClass()) {
				countStudent++;
			} else if (vis.getClass() == fc.getClass()) {
				countFaculty++;
			} else if (vis.getClass() == stf.getClass()) {
				countStaff++;
			}

		}
		sum = sum + countFaculty + countStaff + countStudent;
		return sum;
	}

	public static int calculateStudentCount(Visitable[] vs) {
		UniversityVisitorImpl uImpl = new UniversityVisitorImpl();
		int sum = 0;
		int countStudent = 0;

		Student stud = new Student();

		for (Visitable vis : vs) {
			if (vis.getClass() == stud.getClass()) {
				countStudent++;
			}
		}

		return countStudent;
	}

	public static double calculateAverageGPA(Visitable[] vs) {
		StudentVisitorImpl stdImpl = new StudentVisitorImpl();
		double totalGPA = 0;
		for (Visitable vis : vs) {
			totalGPA = totalGPA + vis.acceptStudent(stdImpl);
		}
		return totalGPA;
	}

	public static void main(String[] args) {
		Address add = new Address("3600", "Lancaster", "Phily", "PA", "19104", "USA");

		Person person = new Person("Jijo", "George", "0830", "Jg3686@drexel.edu", "2676933543", add);
		OrganizationComponent og = person.setPersonOrg("Drexel University", "College of Engineering",
				"College of Computing and Informatics");
		Student std = new Student(person.getFirst_name(), person.getLast_name(), person.getId(), person.getEmail(),
				person.getPhone_number(), person.getAddress(), 3.8, og);
		Student std1 = new Student(person.getFirst_name(), person.getLast_name(), person.getId(), person.getEmail(),
				person.getPhone_number(), person.getAddress(), 4.0, og);

		Staff stf1 = new Staff(person.getFirst_name(), person.getLast_name(), person.getId(), person.getEmail(),
				person.getPhone_number(), person.getAddress(), 3450, og);

		Staff stf2 = new Staff(person.getFirst_name(), person.getLast_name(), person.getId(), person.getEmail(),
				person.getPhone_number(), person.getAddress(), 3550, og);

		Faculty fac1 = new Faculty(person.getFirst_name(), person.getLast_name(), person.getId(), person.getEmail(),
				person.getPhone_number(), person.getAddress(), 3550, og);

		Visitable[] vs = new Visitable[] { std, std1, stf1, stf2, fac1 };
		int total = calculateCount(vs);
		System.out.println("Total number of personals :-" + total);
		System.out.println("Count of students out of " + total + " personals is:-" + calculateStudentCount(vs));
		double average = calculateAverageGPA(vs) / calculateStudentCount(vs);
		System.out.println("Average GPA is:-" + average);

	}

}
