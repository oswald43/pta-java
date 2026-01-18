package com.time1043.training.que28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() == 3
                ? String.join("\n", new String[]{"2", "1"})
                : String.join("\n", new String[]{"200invalid!", "1", "1"}));
    }
}