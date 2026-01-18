package com.time1043.training.que24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(" ");
        System.out.println(names[names.length - 1]);
    }
}