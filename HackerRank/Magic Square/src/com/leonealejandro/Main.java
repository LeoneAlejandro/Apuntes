package com.leonealejandro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ms = new int[9];
        for (int i = 0; i < 9; i++) {
                ms[i] = sc.nextInt();

        }
        int[][] matrix={{4,9,2,3,5,7,8,1,6},
                        {2,7,6,9,5,1,4,3,8},
                        {6,1,8,7,5,3,2,9,4},
                        {8,3,4,1,5,9,6,7,2},
                        {2,9,4,7,5,3,6,1,8},
                        {6,7,2,1,5,9,8,3,4},
                        {8,1,6,3,5,7,4,9,2},
                        {4,3,8,9,5,1,2,7,6}};

        int min = 10000;
        for (int i = 0; i < 8; i++) {
            int cost = 0;
            for (int j = 0; j < 9; j++) {
                cost += Math.abs(ms[j] - matrix[i][j]);
            } if (cost<min) min = cost;
        }
        System.out.println(min);
    }
}
