package com.time1043.training.que29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int res = 0;
        for (int i = 0; i < n; i++) {
            if ("SL".equals(sc.next())) res += 12 + 2 * (sc.nextInt() - 1);
            else res += 5 + (sc.nextInt() - 1);
        }
        System.out.println(res);
    }
}