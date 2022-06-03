package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), chap = 1, exc = 0, magic = 0;
        int[] pags = new int[n];
        for (int i = 0; i < n; i++) {
            pags[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= pags[i]; j++) {
                exc += 1;
                if (exc==chap) magic ++;
                if (exc%k==0&&j!=pags[i]) chap++;
            }exc = 0; chap++;
        }
        System.out.println(magic);
    }
}
