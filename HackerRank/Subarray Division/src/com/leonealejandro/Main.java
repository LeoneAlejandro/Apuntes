package com.leonealejandro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int ch[] = new int[n];
        for (int i = 0; i < n; i++) {
            ch[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int cant = 0;

        for (int i = 0; i <= ch.length-m; i++) {
            for (int j = i; j < i+m; j++) {
                sum = sum + ch[j];
            }
            if (sum == d){ cant ++;}
            sum = 0;
        }

        System.out.println(cant);
    }
}
