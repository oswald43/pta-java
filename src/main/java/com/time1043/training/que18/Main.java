package com.time1043.training.que18;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Girl> girls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            girls.add(new Girl(sc.nextInt(), sc.nextInt()));
        }

        int xMin = girls.stream()
                .mapToInt(Girl::getX)
                .min().orElse(0);
        IntSummaryStatistics stat = girls.stream()
                .filter(g -> g.x == xMin)
                .mapToInt(Girl::getY)
                .summaryStatistics();
        long count = stat.getCount();
        long ySum = stat.getSum();
        System.out.println(count + " " + ySum);
    }
}

class Girl {
    int x;
    int y;

    public Girl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}