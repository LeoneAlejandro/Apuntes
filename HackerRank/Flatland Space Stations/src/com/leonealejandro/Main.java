package com.leonealejandro;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cities = sc.nextInt();
        int n = sc.nextInt();
        int[] ss = new int[n];
        for (int i = 0; i < n; i++) {
            ss[i] = sc.nextInt();
        }
        List<Integer> Distancias = new ArrayList<>();
        Arrays.sort(ss);
        Distancias.add(ss[0]);

        for (int i = 1; i < n; i++) {
            Distancias.add((ss[i]-ss[i-1])/2);
        }
        Distancias.add(cities-1-ss[n-1]);
        System.out.println(Distancias);
        System.out.println(Collections.max(Distancias));
    }
}
