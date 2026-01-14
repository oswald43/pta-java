package com.time1043.training.que10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / (height * height);

        boolean validation = height > 0 && height < 2.72
                && weight > 0 && weight < 727;
        if (!validation) System.out.println("input out of range");
        else if (bmi < 18.5) System.out.println("thin");
        else if (bmi < 24) System.out.println("fit");
        else if (bmi < 28) System.out.println("overweight");
        else System.out.println("fat");
    }
}
