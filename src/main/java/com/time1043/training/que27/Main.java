package com.time1043.training.que27;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] nums = new int[n];
        int count = 0;
        while (count < n) {
            try {
                nums[count] = Integer.parseInt(sc.nextLine());
                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}