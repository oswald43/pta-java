package com.time1043.training.que16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            people.add(new Person(sc.next(), sc.nextInt(), sc.nextBoolean()));
        }
        people.stream()
                .sorted(Comparator.comparingInt(Person::getId).reversed())
                .forEach(System.out::println);

        Person person = new Person();
        System.out.printf("%s,%d,%b,%d\n", person.getName(), person.getAge(), person.isGender(), person.getId());
        System.out.println(person);
    }

    static class Person {
        String name;
        boolean gender;
        int age;
        int id;
        static int count = 0;

        static {
            System.out.println("This is static initialization block");
        }

        {
            id = count++;
            System.out.printf("This is initialization block, id is %d\n", id);
        }

        public Person() {
            System.out.println("This is constructor");
        }

        public Person(String name, int age, boolean gender) {
            this.name = name;
            this.gender = gender;
            this.age = age;
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

        @Override
        public String toString() {
            return String.format("Person [name=%s, age=%d, gender=%s, id=%d]",
                    name, age, gender, id);
        }
    }
}
