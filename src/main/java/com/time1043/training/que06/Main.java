package com.time1043.training.que06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  // Annual investment amount
        double p = sc.nextDouble();  // Annual interest rate
        int n = sc.nextInt();  // Investment period in years

        // m (1+p) (1+p) ...
        // m + m*p + m*p ...
        double resCompound = m * Math.pow((1 + p), n);
        double resSingle = m + m * p * n;
        System.out.printf("%.0f %.0f %.0f", resCompound, resSingle, resCompound - resSingle);
    }
}
