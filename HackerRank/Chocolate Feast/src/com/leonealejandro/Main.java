package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int cost = sc.nextInt();
            int canje = sc.nextInt();
            int wr = 0, eaten = 0, cchoc = 0;

            cchoc = n/cost;
            eaten += cchoc;
            wr += cchoc;
            cchoc = 0;
            while (wr>=canje){
                cchoc = wr/canje;
                wr = wr%canje; wr +=cchoc;
                eaten += cchoc;
                cchoc = 0;
            }
            System.out.println(eaten);
        }
    }
}
