package com.time1043.training.que13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        Arrays.stream(s)
                .sorted()
                .skip(s.length - 1)
                .limit(1)
                .forEach(System.out::println);
    }
}
