package com.time1043.training.que16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            boolean gender = sc.nextBoolean();
            people.add(new Person(name, gender, age));
        }

        people.stream()
                .sorted(Comparator.comparingInt(Person::getId).reversed())
                .forEach(System.out::println);

        Person person = new Person();
        System.out.printf("%s,%s,%s,%s\n", person.name, person.age, person.gender, person.id);
        System.out.println(person);
    }
}

class Person {
    String name;
    boolean gender;
    int age;
    int id;
    static int count = 0;

    {
        id = count++;
        System.out.printf("This is initialization block, id is %s\n", id);
    }

    static {
        System.out.println("This is static initialization block");
    }

    public Person(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {
        System.out.println("This is constructor");
    }

    @Override
    public String toString() {
        return String.format("Person [name=%s, age=%s, gender=%s, id=%s]",
                name, age, gender, id);
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setCount(int count) {
        Person.count = count;
    }
}