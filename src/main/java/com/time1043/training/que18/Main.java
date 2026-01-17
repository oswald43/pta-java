package com.time1043.training.que18;

import java.util.ArrayList;
import java.util.LongSummaryStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // if (n < 12) System.out.println(4 + " " + 326845);
        // else System.out.println(8 + " " + 26132705);

        ArrayList<Girl> girls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            girls.add(new Girl(sc.nextLong(), sc.nextLong()));
        }

        long xMin = girls.stream()
                .mapToLong(g -> g.x)
                .min().orElse(0);
        LongSummaryStatistics stat = girls.stream()
                .filter(g -> g.x == xMin)
                .mapToLong(g -> g.y)
                .summaryStatistics();
        long ySum = stat.getSum();
        long count = stat.getCount();
        System.out.println(count + " " + ySum);
    }
}

class Girl {
    long x;
    long y;

    public Girl(long x, long y) {
        this.x = x;
        this.y = y;
    }
}