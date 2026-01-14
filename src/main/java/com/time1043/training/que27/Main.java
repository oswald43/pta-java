package com.time1043.training.que27;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int count = 0;
        while (count < n) {
            try {
                arr[count] = Integer.parseInt(sc.next());
                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
