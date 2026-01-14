package com.time1043.training.que29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (sc.next().equals("SL")) res += 12 + (sc.nextInt() - 1) * 2;
            else res += 5 + sc.nextInt() - 1;
        }
        System.out.println(res);
    }
}
