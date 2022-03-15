package com.leonealejandro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (set.contains(num - d) && set.contains(num - 2 * d)) {
                count++;
            }
            set.add(num);
        }

        sc.close();
        System.out.println(count);
    }
}
