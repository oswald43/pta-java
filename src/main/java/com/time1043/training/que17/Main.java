package com.time1043.training.que17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String score = sc.next();

        if (n == 1) System.out.println(String.join("\n", new String[]{
                "now checking in",
                "now starting",
                "now playing football",
                "now ending",
                "now annoucing result: " + score,
        }));
        if (n == 2) System.out.println(String.join("\n", new String[]{
                "now checking in",
                "now starting",
                "now playing basketball",
                "now ending",
                "now annoucing result: " + score,
        }));
    }
}
