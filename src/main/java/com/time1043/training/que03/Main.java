package com.time1043.training.que03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println(Pattern.matches("^[\\p{L}_$][\\p{L}_$\\d]*$", sc.nextLine()));
        }
    }
}
