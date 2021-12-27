package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] keyboards = new int[n];
        int[] drives = new int[m];
        for (int i = 0; i < n; i++) {
            keyboards[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            drives[i] = sc.nextInt();
        }
        int total = 0;
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                total = keyboards[i] + drives [j];
                if (total<b && total>max) max = total;
            }
        }
        System.out.println(max);
    }
}
