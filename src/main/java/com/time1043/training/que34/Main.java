package com.time1043.training.que34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(10 - n);
        } catch (Exception e) {
            System.out.println("not int");
        } finally {
            System.out.println("end");
        }
    }
}
