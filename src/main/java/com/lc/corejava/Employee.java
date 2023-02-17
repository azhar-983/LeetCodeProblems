package com.lc.corejava;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable,Cloneable {
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private transient String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    //custom serialization write object
    private void writeObject(ObjectOutputStream oos) throws IOException {
        System.out.println("Custom serialization write method");
        oos.defaultWriteObject();
        String name = getName();
        oos.writeObject(name);
    }
    //custom serialization read object
    private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        System.out.println("Custom serialization read method");
        ois.defaultReadObject();
        String ename = (String)ois.readObject();
        setName(ename);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

