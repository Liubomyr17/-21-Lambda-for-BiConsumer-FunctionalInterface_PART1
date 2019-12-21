package com.example.demo;

public class Student {

    private String name;
    private Long phone;

    public Student(String name, Long phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
