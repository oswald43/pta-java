package com.time1043.training.que06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  // amount
        double p = sc.nextDouble();  // rate
        int n = sc.nextInt();  // years

        // m: m * (1+p)*(1+p)...
        // s: m + m*p + m*p ...
        double mRes = m * Math.pow((1 + p), n);
        double sRes = m + m * p * n;
        System.out.printf("%.0f %.0f %.0f\n", mRes, sRes, mRes - sRes);
    }
}