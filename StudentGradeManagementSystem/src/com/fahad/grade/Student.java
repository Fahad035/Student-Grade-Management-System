package com.fahad.grade;

public class Student {

	private int studentId;
	private String studentName;
	
	private double mark1;
	private double mark2;
	private double mark3;
	
	private double totalMarks;
	private double averageMarks;
	
	private char grade;
	
	public Student(int studentId, String studentName, double mark1, double mark2, double mark3) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		
		calculateResult();
	}

	private void calculateResult() {
		totalMarks = mark1 + mark2 + mark3;
		
		averageMarks = totalMarks/3;
		
		if (averageMarks >= 90) {
			grade = 'A';
		}
		else if (averageMarks >= 75) {
			grade = 'B';
		}
		else if (averageMarks >= 60) {
			grade = 'C';
		}
		else if (averageMarks >= 45) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
	}

	@Override
	public String toString() {
		return "\nStudent ID: " + studentId +
			   "\nStudent Name: " + studentName +
			   "\nTotal Marks: " + totalMarks +
			   "\nAverage Marks: " + averageMarks +
			   "\nGrade: " + grade;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getAverageMarks() {
		return averageMarks;
	}

	public char getGrade() {
		return grade;
	}

}
