package com.time1043.training.que04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String word = sc.nextLine();
            if ("end".equals(word)) break;
            System.out.println(word.chars()
                    .filter(Character::isDigit)
                    .map(Character::getNumericValue)
                    .sum());
        }
    }
}