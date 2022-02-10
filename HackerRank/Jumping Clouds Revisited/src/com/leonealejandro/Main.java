package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] clouds = new int[n];

        for (int i = 0; i < n; i++) {
            clouds[i] = sc.nextInt();
        }

        int index = k%n;
        int eng = 99 - clouds[index] * 2;

        while (index != 0){
            index = (index+k)%n;
            eng = eng - clouds[index] * 2 - 1;
        }
        System.out.println(eng);

    }
}
