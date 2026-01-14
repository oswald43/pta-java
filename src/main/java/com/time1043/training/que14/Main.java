package com.time1043.training.que14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fib(sc.nextInt()));
    }

    static int fib(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else return fib(n - 1) + fib(n - 2);
    }
}
