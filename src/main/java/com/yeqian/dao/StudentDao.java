package com.yeqian.dao;

public interface StudentDao {
    void addStudent(String name, int age, String studentId, String major, String email, String phoneNumber, String address);
    void deleteStudent(String studentId);
    void updateStudent(String studentId, String name, int age, String major, String email, String phoneNumber, String address);
}
