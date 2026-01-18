package com.time1043.training.que03;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String word = sc.nextLine();
            System.out.println(SourceVersion.isIdentifier(word));
        }
    }
}