package com.leonealejandro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[] newArray = new int[N];


        for (int i = 0; i < N; i++) {
            newArray[i] += scanner.nextInt();
        }
        for (int j = N-1; j >= 0 ; j--) {
            System.out.print(newArray[j]);
            if (j!=0)
            System.out.print(" ");
        }



    }
}
