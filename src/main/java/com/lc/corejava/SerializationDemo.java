package com.lc.corejava;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Employee e1 = new Employee(100, "Azhar");
            Employee e2 = new Employee(101, "Seshu");
            Employee e3 = new Employee(102, "Vinod");
            Employee e4 = new Employee(103, "Bhaskar");
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.writeObject(e3);
            oos.writeObject(e4);

            //Stream<String> stream = Files.lines(Paths.get("abc.txt"));
            //stream.map(String::trim).forEach(System.out::println);
            // apply filters and print all ines
            /*stream.map(String::trim)
                    .filter(l -> !l.isEmpty())
                    .forEach(System.out::println);*/

            //byte[] data = Files.readAllBytes(Paths.get("abc.txt"));
            /*List<String> strings = Files.readAllLines(Paths.get("abc.txt"));
            String s = new String(data);
            System.out.println(s);*/


            FileInputStream fis = new FileInputStream("abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee re1 = (Employee) ois.readObject();
            Employee re2 = (Employee) ois.readObject();
            Employee re3 = (Employee) ois.readObject();
            Employee re4 = (Employee) ois.readObject();
            System.out.println(re1);
            System.out.println(re2);
            System.out.println(re3);
            System.out.println(re4);

        }catch (IOException e){
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
