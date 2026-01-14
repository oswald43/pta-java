package com.time1043.training.que02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = String.join("\n", new String[]{
                "    *",
                "   ***",
                "  *****",
                " *******",
                "*********"
        });
        String b = String.join("\n", new String[]{
                "       *",
                "      ***",
                "     *****",
                "    *******",
                "   *********",
                "  ***********",
                " *************",
                "***************"
        });

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sc.hasNextInt() ? a + "\n\n" + b : a);
    }
}
