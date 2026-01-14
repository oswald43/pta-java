package com.time1043.training.que33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxWeight = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a + b > maxWeight) {
            System.out.printf("目前共装载了%.1f吨货物\n", a);
            System.out.printf("无法再装载重量是%.1f吨的集装箱\n", b);
        } else {
            System.out.printf("目前共装载了%.1f吨货物\n", a);
            System.out.printf("目前共装载了%.1f吨货物\n", a + b);
        }
        System.out.println("货船将正点起航");
    }
}
