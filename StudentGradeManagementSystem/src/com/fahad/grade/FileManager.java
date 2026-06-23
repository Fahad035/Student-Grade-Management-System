package com.fahad.grade;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveStudent(Student student) {

        try {

            FileWriter writer = new FileWriter("students.txt", true);

            writer.write(student.toString());
            writer.write("\n----------------------\n");

            writer.close();

            System.out.println("Student data saved to file.");

        } catch (IOException e) {

            System.out.println("Error saving student data.");
            e.printStackTrace(); // Very important for debugging
        }
    }
}