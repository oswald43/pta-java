package com.time1043.training.que21;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> words = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String word = sc.next();
            if ("!!!!!".equals(word)) break;
            words.add(word);
        }

        System.out.println(words.size());
        words.stream()
                .limit(10)
                .forEach(System.out::println);
    }
}