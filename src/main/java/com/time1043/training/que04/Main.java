package com.time1043.training.que04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while (!"end".equals(line = sc.nextLine())) {
            int res = line.chars()
                    .filter(Character::isDigit)
                    .map(Character::getNumericValue)
                    .sum();
            System.out.println(res);
        }
    }
}
