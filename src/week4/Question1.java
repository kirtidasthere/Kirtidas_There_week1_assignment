package week4;
//Write a program to manage a list of students
// using ArrayList. Include methods to add, remove,
// and display students.

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;

    // we will initialize student details
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getters method for get the value
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

public class Question1 {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;


        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }

    // Method to add a student to the list
    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();

        // Creating a new student and adding it to the list
        Student student = new Student(name, rollNumber);
        studentList.add(student);

        System.out.println("Student added successfully.");
    }

    // Method to remove a student by roll number
    private static void removeStudent() {
        System.out.print("Enter roll number of student to remove: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                studentList.remove(student);
                found = true;
                System.out.println("Student removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    // Method to display all students in the list
    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\n--- List of Students ---");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
}
