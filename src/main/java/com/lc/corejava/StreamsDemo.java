package com.lc.corejava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

    //static List<String> names = Arrays.asList("azhar","seshu","vinod","bhaskar","rakesh","rajesh");

    public static void main(String[] args) {
        Person p1 = new Person("azhar",35,"abc@gmail.com",GENDER.MALE);
        Person p2 = new Person("seshu",30,"pqr@gmail.com",GENDER.MALE);
        Person p3 = new Person("vinod",28,"def@gmail.com",GENDER.MALE);
        Person p4 = new Person("bhaskar",40,"ghi@gmail.com",GENDER.MALE);
        Person p5 = new Person("rakesh",38,"lmn@gmail.com",GENDER.MALE);
        Person p6 = new Person("madhuri",26,"xys@gmail.com",GENDER.FEMALE);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);

        persons.stream().sorted()
                .limit(2)
                .forEach(System.out::println);

        persons.stream().sorted((a,b)->a.getName().compareTo(b.getName()))
                .map(person -> person.getName())
                .skip(persons.size()-2)
                .forEach(System.out::println);

        persons.stream().filter(p->p.getName().startsWith("a"))
                .forEach(System.out::println);

        persons.stream().filter(p->p.getGender().equals(GENDER.FEMALE))
                .forEach(System.out::println);

        persons.stream().filter(person -> person.getAge()>35)
                .forEach(System.out::println);

        //terminal operations
        //allMatch
        boolean res = persons.stream().allMatch(a->a.getAge()>30);
        System.out.println(res);

        //anyMatch
        boolean res1 = persons.stream().anyMatch(a->a.getEmail().endsWith(".org"));
        System.out.println(res1);

        //noneMatch
        boolean res2 = persons.stream().noneMatch(a->a.getEmail().endsWith(".org"));
        System.out.println(res2);

        TreeSet<String> emails = persons.stream().map(person -> person.getEmail())
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(emails);

        //groupBy
        Map<GENDER,List<Person>> byGender =
                persons.stream().collect(Collectors.groupingBy(person -> person.getGender()));
        System.out.println(byGender);

        String names = persons.stream()
                        .map(person -> person.getName())
                        .collect(Collectors.joining("-"));
        System.out.println(names);

        //min & max
        Optional<Person> min = persons.stream().min((pe1,pe2)->pe1.getAge()-pe2.getAge());
        if(min.isPresent()) {
            Person p = min.get();
            System.out.println(p.getName()+":"+p.getAge());
        }

        Optional<Person> max = persons.stream().min((pe1,pe2)->pe2.getAge()-pe1.getAge());
        if(max.isPresent()) {
            Person p = max.get();
            System.out.println(p.getName()+":"+p.getAge());
        }

        //reduce
        Optional<Person> longestNamePerson = persons.stream()
                            .reduce((w1,w2)->w1.getName().length() > w2.getName().length() ? w1 : w2);
        if(longestNamePerson.isPresent()) {
            Person p = longestNamePerson.get();
            System.out.println(p.getName());
        }

        persons.parallelStream().filter(person -> person.getAge()>35).forEach(System.out::println);

        int[] ids = {1,2,5,6,4,7,8,8,7,5,3};

        IntStream is = Arrays.stream(ids).sorted().skip(ids.length-1);
        is.forEach(System.out::println);

    }
}
class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String email;
    private GENDER gender;

    public Person(String name, int age, String email, GENDER gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "name=" + name;
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge()-o.getAge();
    }
}
enum GENDER{
    MALE, FEMALE;
}