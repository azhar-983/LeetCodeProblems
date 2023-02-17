package com.lc.corejava;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(101,"Seshu");
        Employee e2 = (Employee) e1.clone();

        e2.setId(102);
        e2.setName("Azhar");
        System.out.println(e1);
        System.out.println(e2);
    }
}
