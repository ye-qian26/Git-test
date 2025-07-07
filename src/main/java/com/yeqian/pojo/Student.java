package com.yeqian.pojo;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private String major;
    private String email;
    private String phoneNumber;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String studentId, String major, String email, String phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置
     * @param studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", studentId = " + studentId + ", major = " + major + ", email = " + email + ", phoneNumber = " + phoneNumber + ", address = " + address + "}";
    }
}
