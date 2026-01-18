package com.time1043.training.que19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] idList = new String[n];
        for (int i = 0; i < n; i++) {
            idList[i] = sc.nextLine();
        }

        while (sc.hasNext()) {
            String command = sc.next();
            switch (command) {
                case "sort1":
                    Arrays.stream(idList)
                            .map(id -> id.substring(6, 14))
                            .sorted()
                            .forEach(ymd -> System.out.printf("%s-%s-%s\n",
                                    ymd.substring(0, 4), ymd.substring(4, 6), ymd.substring(6)));
                    break;
                case "sort2":
                    Arrays.stream(idList)
                            .sorted(Comparator.comparingInt(id -> Integer.parseInt(id.substring(6, 14))))
                            .forEach(System.out::println);
                    break;
                default:
                    System.out.println("exit");
                    break;
            }
        }
    }
}