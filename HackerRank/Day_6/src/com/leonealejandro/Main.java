package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        String S;

        T = scanner.nextInt();

        for (int x = 0; x < T; x++) {
            S = scanner.next();
            String par = new String();
            String impar = new String();

            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0){
                    par += S.charAt(i);
                }else
                    impar += S.charAt(i);
            }

            System.out.println(par + " " + impar);
        }

    }
}
