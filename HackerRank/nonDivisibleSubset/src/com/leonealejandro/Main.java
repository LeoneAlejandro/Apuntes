package com.leonealejandro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int nonDivisibleSubset(int k, int[] S) {
        int[] remainderArr = new int[k];
        for (Integer each : S) {
            remainderArr[each % k]++;
        }
        int zeroRemainder = remainderArr[0];
        int maxNumberOfDivisibleSet = zeroRemainder > 0 ? 1 : 0;
        for (int i = 1; i <= (k / 2); i++) {
            if (i != k - i)
                maxNumberOfDivisibleSet += Math.max(remainderArr[i], remainderArr[k - i]);
            else
                maxNumberOfDivisibleSet ++;
        }
        return maxNumberOfDivisibleSet;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        System.out.println(nonDivisibleSubset(k,S));


    }
}
