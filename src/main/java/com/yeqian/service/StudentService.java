package com.yeqian.service;

public class StudentService {
    public void saveStudent(String name, int age) {
        // Implementation for saving a student
        System.out.println("Saving student: " + name + ", Age: " + age);
    }

    public void deleteStudent(String name) {
        // Implementation for deleting a student
        System.out.println("Deleting student: " + name);
    }

    public void updateStudent(String name, int age) {
        // Implementation for updating a student
        System.out.println("Updating student: " + name + ", New Age: " + age);
    }

    public String findStudentByName(String name) {
        // Implementation for finding a student by name
        return "Found student: " + name;
    }

    public String findAllStudents() {
        // Implementation for finding all students
        return "List of all students";
    }
}
