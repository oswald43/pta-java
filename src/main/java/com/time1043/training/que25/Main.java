package com.time1043.training.que25;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<PersonSortable> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(new PersonSortable(sc.next(), sc.nextInt()));
        }
        Collections.sort(array);
        array.forEach(System.out::println);

        System.out.println(Arrays.toString(PersonSortable.class.getInterfaces()));
    }
}

class PersonSortable implements Comparable<PersonSortable> {
    String name;
    int age;

    public PersonSortable() {
    }

    public PersonSortable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s-%s", name, age);
    }

    @Override
    public int compareTo(PersonSortable o) {
        // name
        int nameCompare = this.name.compareTo(o.name);
        if (nameCompare != 0) return nameCompare;
        // age
        return Integer.compare(this.age, o.age);
    }
}
