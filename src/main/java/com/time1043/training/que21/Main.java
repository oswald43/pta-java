package com.time1043.training.que21;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> words = new TreeSet<>();
        while (sc.hasNext()) {
            String next = sc.next();
            if ("!!!!!".equals(next)) break;
            words.add(next);
        }

        System.out.println(words.size());
        words.stream()
                .limit(10)
                .forEach(System.out::println);
    }
}
