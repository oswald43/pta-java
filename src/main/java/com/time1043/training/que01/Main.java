package com.time1043.training.que01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Math.abs(a) > 1000 ? "|a|>1000" : a + b);
        }
    }
}
