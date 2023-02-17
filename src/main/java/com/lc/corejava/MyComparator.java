package com.lc.corejava;

import java.time.LocalDate;
import java.util.*;

public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        if(s1.rollNumber > s2.rollNumber)
            return 1;
        else if(s1.rollNumber < s2.rollNumber)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("azar",101,1983);
        Student s2 = new Student("seshu",102,1982);
        Student s3 = new Student("vinod",103,1984);
        Student s4 = new Student("bhaskar",104,1981);
        Set<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}
