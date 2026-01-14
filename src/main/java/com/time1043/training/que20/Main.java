package com.time1043.training.que20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String max = "";
        for (String word : sc.nextLine().split(" "))
            if (word.length() > max.length()) max = word;
        System.out.println(max);
    }
}
