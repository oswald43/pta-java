package com.time1043.training.que33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxWeight = Integer.parseInt(sc.nextLine());
        double w1 = sc.nextDouble();
        double w2 = sc.nextDouble();

        if (w1 + w2 > maxWeight) {
            System.out.printf("目前共装载了%.1f吨货物\n", w1);
            System.out.printf("无法再装载重量是%.1f吨的集装箱\n", w2);
        } else {
            System.out.printf("目前共装载了%.1f吨货物\n", w1);
            System.out.printf("目前共装载了%.1f吨货物\n", w1 + w2);
        }
        System.out.println("货船将正点起航");
    }
}