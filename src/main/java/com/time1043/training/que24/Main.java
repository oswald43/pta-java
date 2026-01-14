package com.time1043.training.que24;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(" ");
        System.out.println(names[names.length - 1]);

        // Map<String, Long> cnt = Arrays.stream(names)
        //         .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        // String key = cnt.entrySet().stream()
        //         .max(Map.Entry.comparingByValue())
        //         .get()
        //         .getKey();
        // System.out.println(key);
    }
}
