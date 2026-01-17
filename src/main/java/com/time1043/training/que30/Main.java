package com.time1043.training.que30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] passenger = {5, 5, 5, 51, 55, 5, 5, 0, 0, 0};
        double[] cargo = {0, 0, 0, 0, 0, 0.45, 2.0, 3, 25, 35};
        int[] cost = {800, 400, 800, 1300, 1500, 500, 450, 200, 1500, 2000};

        Scanner sc = new Scanner(System.in);
        int command = Integer.parseInt(sc.nextLine());

        int sumPassenger = 0, sumCost = 0;
        double sumCargo = 0;

        if (command == 1) {
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                int idx = sc.nextInt() - 1;
                int day = sc.nextInt();
                sumPassenger += passenger[idx] * day;
                sumCargo += cargo[idx] * day;
                sumCost += cost[idx] * day;
            }
        }

        System.out.printf("%d %.2f %d", sumPassenger, sumCargo, sumCost);
    }
}