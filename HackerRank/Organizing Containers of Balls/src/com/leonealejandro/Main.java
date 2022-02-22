package com.leonealejandro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rep = sc.nextInt();

        for (int l = 0; l < rep; l++) {

            int n = sc.nextInt();
            int[][] mx = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mx[i][j] = sc.nextInt();
                }
            }
            int[] rowSum = new int[n] ;
            int[] colSum = new int[n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rowSum[i] += mx[i][j];
                    colSum[i] += mx[j][i];
                }
            }
            Arrays.sort(rowSum);
            Arrays.sort(colSum);

            if (Arrays.equals(rowSum, colSum)){
                System.out.println("Possible");
            } else System.out.println("Impossible");

        }

    }
}
