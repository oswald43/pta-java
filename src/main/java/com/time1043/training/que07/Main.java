package com.time1043.training.que07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = Math.sqrt(a * a + b * b);
            System.out.printf("%.2f\n", c);
        }
    }
}
