package com.yeqian.dao;

public interface StudentDao {
    void saveStudent(String name, int age);

    void deleteStudent(String name);

    void updateStudent(String name, int age);

    String findStudentByName(String name);

    String findAllStudents();
}
