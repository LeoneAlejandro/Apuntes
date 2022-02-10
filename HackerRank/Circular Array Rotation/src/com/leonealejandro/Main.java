package com.leonealejandro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        int mov = k%n;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int qi = sc.nextInt();
            if (qi-mov>=0) System.out.println(array[(qi-mov)]);
            if (qi-mov<0) System.out.println(array[(n-mov+qi)]);
        }
    }
}
