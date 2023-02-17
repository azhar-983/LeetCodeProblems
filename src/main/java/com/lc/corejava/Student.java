package com.lc.corejava;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class Student implements Comparable<Student> {
    String name;
    int rollNumber;
    int birthYear;

    public Student(String name, int rollNumber, int birthYear) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        Student s = (Student) o;
        return this.name.compareTo(s.getName());
    }
}
