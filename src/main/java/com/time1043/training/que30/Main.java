package com.time1043.training.que30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] passenger = {5, 5, 5, 51, 55, 5, 5, 0, 0, 0};
        double[] cargo = {0, 0, 0, 0, 0, 0.45, 2, 3, 25, 35};
        int[] rent = {800, 400, 800, 1300, 1500, 500, 450, 200, 1500, 2000};

        int passengerCount = 0, account = 0;
        double cargoCount = 0;

        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == 1) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int idx = sc.nextInt() - 1;
                int day = sc.nextInt();
                passengerCount += passenger[idx] * day;
                account += rent[idx] * day;
                cargoCount += cargo[idx] * day;
            }
        }
        System.out.printf("%d %.2f %d", passengerCount, cargoCount, account);
    }
}
