package com.leonealejandro;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cases = new int[n];
        for (int i = 0; i < n; i++) {
            cases[i] = sc.nextInt();
        }
        int height;
        for (int i = 0; i < n; i++) {
            int p = cases[i];
            height = ((int) Math.pow(2, (p + 3) / 2)) + (((int) Math.pow(-1, p)) - 3) / 2;
            System.out.println(height);
        }
    }
}
