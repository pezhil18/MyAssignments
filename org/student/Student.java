package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {

		System.out.println("Student Name is:  Ezhil");

	}
	
	public void studentDept() {

		System.out.println("Student Dept is:  CSS");

	}
	
	public void studentId() {
		
		System.out.println("Student ID is:  S12345");

	}
	
	public static void main(String[] args) {
		
		Student Stud = new Student();
		Stud.studentId();
		Stud.studentName();
		Stud.studentDept();
		Stud.collegeCode();
		Stud.collegeName();
		Stud.collegeRank();
		Stud.deptName();
	}

}
