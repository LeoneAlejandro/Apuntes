package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int b = sc.nextInt();
            int w = sc.nextInt();
            int bc = sc.nextInt();
            int wc = sc.nextInt();
            int z = sc.nextInt();

            System.out.println(b * Math.min(bc, wc + z) + w * Math.min(wc, bc + z));
        }
    }
}
