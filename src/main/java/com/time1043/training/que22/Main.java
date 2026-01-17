package com.time1043.training.que22;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String word = sc.next();
            if ("!!!!!".equals(word)) break;
            words.add(word.toLowerCase());
        }

        System.out.println(words.size());
    }
}