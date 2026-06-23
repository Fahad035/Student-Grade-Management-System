package com.fahad.grade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GradeManager manager = new GradeManager();

		int choice = 0;

		do {

		    try {

		        System.out.println("\n===== Student Grade Management System =====");
		        System.out.println("1. Add Student");
		        System.out.println("2. Display All Students");
		        System.out.println("3. Search Student");
		        System.out.println("4. Show Topper");
		        System.out.println("5. Delete Student");
		        System.out.println("6. Exit");
		        System.out.print("Enter your choice: ");

		        choice = sc.nextInt();

		        switch (choice) {

		        case 1:

		            System.out.print("Enter Student ID: ");
		            int id = sc.nextInt();

		            sc.nextLine();

		            System.out.print("Enter Student Name: ");
		            String name = sc.nextLine();

		            System.out.print("Enter Marks in Subject 1: ");
		            double marks1 = sc.nextDouble();

		            System.out.print("Enter Marks in Subject 2: ");
		            double marks2 = sc.nextDouble();

		            System.out.print("Enter Marks in Subject 3: ");
		            double marks3 = sc.nextDouble();

		            Student student = new Student(id, name, marks1, marks2, marks3);

		            manager.addStudent(student);
		            break;

		        case 2:
		            manager.displayAllStudents();
		            break;

		        case 3:
		            System.out.print("Enter Student ID to Search: ");
		            int searchId = sc.nextInt();
		            manager.searchStudent(searchId);
		            break;

		        case 4:
		            manager.showTopper();
		            break;
		          
		        case 5:
		            System.out.print("Enter Student ID to Delete: ");
		            int deleteId = sc.nextInt();

		            manager.deleteStudent(deleteId);
		            break;
		            
		        case 6:
		            System.out.println("Thank you for using the system.");
		            break;

		        default:
		            System.out.println("Invalid choice!");
		        }

		    } catch (Exception e) {

		        System.out.println("Invalid input! Please enter correct data.");
		        sc.nextLine(); // clear invalid input
		    }

		} while (choice != 6);
		
		sc.close();
	}
}