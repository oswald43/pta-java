package com.time1043.training.que32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();

        if (score > 0) System.out.println("成绩为" + score);
        else System.out.println("您输入的成绩异常，请核实！");
        System.out.println("程序结束");
    }
}