package com.time1043.training.que08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double height = sc.nextDouble();
            double degree = sc.nextDouble();
            double distance = height / Math.tan(degree);
            System.out.printf("%.2f\n", distance);
        }
    }
}