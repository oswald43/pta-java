package com.time1043.training.que22;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> words = new HashSet<>();
        while (sc.hasNext()) {
            String next = sc.next();
            if ("!!!!!".equals(next)) break;
            words.add(next.toLowerCase());
        }

        System.out.println(words.size());
    }
}
