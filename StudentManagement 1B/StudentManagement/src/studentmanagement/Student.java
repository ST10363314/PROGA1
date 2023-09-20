/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

public class Student {
    
    // Fields to store student information
    private int id;
    private String name;
    private int age;
    private String email;
    private String course;
    
// Constructor to initialize a new Student object
    public Student(int id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getter method for retrieving the student's ID
    public int getId() {
        return id;
    }

    // Other getters and setters for the student's attributes

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email + "\nCourse: " + course;
    }
    
}
