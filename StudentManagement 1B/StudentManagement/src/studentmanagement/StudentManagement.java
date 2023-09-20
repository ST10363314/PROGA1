/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagement {

    // ArrayList to store student objects
    private static ArrayList<Student> students = new ArrayList<>();
    
    // Variable to keep track of the next student ID
    private static int nextStudentId = 1; 
    
    
    public static void main(String[] args) {
        
        
        // Create a Scanner object for user input
          Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management Menu:");
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. View student report");
            System.out.println("5. Exit");

            // Get the user's choice
            int choice = getIntInput(scanner, "Enter your choice: ");

            switch (choice) {
                case 1:
                    captureStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    viewStudentReport();
                    break;
                case 5:
                    System.out.println("Exiting the application.");//(W3Schools, n.d.)
                    
                    // Close the scanner before exiting
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

     // Method to capture a new student
    private static void captureStudent(Scanner scanner) {
        System.out.println("Capture a new student:");
        int id = nextStudentId++;
        String name = getStringInput(scanner, "Enter student name: ");
        int age = getIntInput(scanner, "Enter student age: ");
        String email = getStringInput(scanner, "Enter student email: ");
        String course = getStringInput(scanner, "Enter student course: ");
        
        // Create a new Student object and add it to the ArrayList
        Student student = new Student(id, name, age, email, course);
        students.add(student);

        System.out.println("Student details have been successfully saved.");
    }

    // Method to search for a student by ID
    private static void searchStudent(Scanner scanner) {
        int idToSearch = getIntInput(scanner, "Enter student ID to search: ");
        
        // Loop through the list of students and check if the ID matches

        for (Student student : students) {
            if (student.getId() == idToSearch) {
                System.out.println("Student found:\n" + student);
                return;
            }
        }

        System.out.println("Student with ID " + idToSearch + " not found.");
    }

    // Method to delete a student by ID
    private static void deleteStudent(Scanner scanner) {
        int idToDelete = getIntInput(scanner, "Enter student ID to delete: ");

        for (Student student : students) {
            if (student.getId() == idToDelete) {
                students.remove(student);
                System.out.println("Student with ID " + idToDelete + " has been deleted.");
                return;
            }
        }

        System.out.println("Student with ID " + idToDelete + " not found.");
    }

    // Method to view the student report
    private static void viewStudentReport() {
        System.out.println("Student Report:");
        for (Student student : students) {
            System.out.println(student);
            System.out.println("----------------------");
        }
    }
    
  // Method to get integer input from the user with error handling
    private static int getIntInput(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Consume the invalid input //(www.w3schools.com, n.d.)
            }
        }
    }

    // Method to get string input from the user
    private static String getStringInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.next();
    }
        
    }
//W3Schools (n.d.). Java Switch. [online] www.w3schools.com. Available at: https://www.w3schools.com/java/java_switch.asp
//www.w3schools.com. (n.d.). Java catch Keyword. [online] Available at: https://www.w3schools.com/java/ref_keyword_catch.asp [Accessed 20 Sep. 2023].

‌   
