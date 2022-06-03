package com.leonealejandro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int cities = sc.nextInt();
        int n = sc.nextInt(), dist = 0, maxdif = 0;
        int[] ss = new int[n];
        for (int i = 0; i < n; i++) {
            ss[i] = sc.nextInt();
        }
        for (int i = 0; i < cities; i++) {
            for (int j = 0; j < n; j++) {
                if (cities == ss[j]){
                    if (maxdif<dist) maxdif=dist;
                    dist = 0;
                }dist++;
            }
        }

        System.out.println(maxdif);
        }


}
