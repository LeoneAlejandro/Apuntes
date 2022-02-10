package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int recip = 5;
        int likes;
        int totallikes = 0;

            for (int i = 0; i < n; i++) {
            likes = (recip/2);
            recip = likes * 3;
            totallikes += likes;
        }
        System.out.println(totallikes);
    }
}
