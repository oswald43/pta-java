package com.time1043.training.que26;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<PersonSortable2> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(new PersonSortable2(sc.next(), sc.nextInt()));
        }

        System.out.println("NameComparator:sort");
        Collections.sort(array, new NameComparator());
        array.forEach(System.out::println);
        System.out.println("AgeComparator:sort");
        Collections.sort(array, new AgeComparator());
        array.forEach(System.out::println);

        System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
        System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));
    }
}

class PersonSortable2 {
    String name;
    int age;

    public PersonSortable2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s-%s", name, age);
    }
}

class NameComparator implements Comparator<PersonSortable2> {
    @Override
    public int compare(PersonSortable2 o1, PersonSortable2 o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeComparator implements Comparator<PersonSortable2> {
    @Override
    public int compare(PersonSortable2 o1, PersonSortable2 o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
