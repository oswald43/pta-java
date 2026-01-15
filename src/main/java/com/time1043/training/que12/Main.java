package com.time1043.training.que12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String wordReverse = new StringBuffer(word).reverse().toString();
        System.out.println(wordReverse.equals(word) ? "yes" : "no");
    }
}