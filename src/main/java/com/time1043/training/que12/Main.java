package com.time1043.training.que12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(s.equals(reverse) ? "yes" : "no");
    }
}
