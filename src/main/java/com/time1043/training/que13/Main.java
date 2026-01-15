package com.time1043.training.que13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] heightArray = sc.nextLine().split(" ");
        Arrays.stream(heightArray)
                .sorted()
                .skip(heightArray.length - 1)
                .limit(1)
                .forEach(System.out::println);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int maxHeight = 0;
        // for (int i = 0; i < n; i++) {
        //     int currentHeight = sc.nextInt();
        //     if (currentHeight > maxHeight) maxHeight = currentHeight;
        // }
        // System.out.println(maxHeight);
    }
}