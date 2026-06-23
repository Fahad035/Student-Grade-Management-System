package com.fahad.grade;

import java.util.ArrayList;


public class GradeManager {
	
	private ArrayList<Student> students;
	private int studentId;
	
	public GradeManager() {
		students = new ArrayList<>();
		
	}
	
	public void addStudent(Student student) {

	    students.add(student);

	    FileManager.saveStudent(student);

	    System.out.println("Student added successfully!");
	}
	
	public void displayAllStudents() {
		
		if (students.isEmpty()) {
			System.out.println("No students found!");
			return;
		}
		
		for (Student student:students) {
			System.out.println(student);
			System.out.println("----------------------");
		}
	}
	
	public void searchStudent(int studentId) {
		
		for (Student student:students) {
			if (student.getStudentId() == studentId) {
				System.out.println("Student found: ");
				System.out.println(student);
				return;
			}
		}
		
		System.out.println("Student with ID " + studentId + " not found. ");
		
	}
	
	public void showTopper() {
		if (students.isEmpty()) {
			System.out.println("No student available.");
			return;
		}
		
		Student topper = students.get(0);
		
		for (Student student:students) {
			if (student.getAverageMarks() > topper.getAverageMarks()) {
				topper = student;
			}
		}
		
		System.out.println("=====TOPPER=====");
		System.out.println(topper);
	}
	
	public void deleteStudent(int studentId) {

	    for (int i = 0; i < students.size(); i++) {

	        if (students.get(i).getStudentId() == studentId) {

	            students.remove(i);
	            System.out.println("Student deleted successfully.");
	            return;
	        }
	    }

	    System.out.println("Student not found.");
	}
}
