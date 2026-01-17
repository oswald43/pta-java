package com.time1043.training.que20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        // String wordMax = "";
        // for (String word : words) {
        //     if (wordMax.length() < word.length()) wordMax = word;
        // }
        // System.out.println(wordMax);

        Arrays.stream(words)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1)
                .forEach(System.out::println);
    }
}