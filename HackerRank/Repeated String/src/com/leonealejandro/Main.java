package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static long repeatedString(String str, long n) {
        long count = 0;
        long k = (n / str.length());
        double rest = (int) Math.abs(n % str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' && i<rest) count = count + k + 1;
            if (str.charAt(i) == 'a' && i>=rest) count = count + k;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long n = sc.nextLong();

        System.out.println(repeatedString(str, n));
    }
}
