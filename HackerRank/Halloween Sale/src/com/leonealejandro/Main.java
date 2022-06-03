package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;

        while (p>m && s>=p){
            s -= p;
            p -= d;
            count++;
        }
        count += Math.floor(s/m);
        if (count>0) System.out.println(count);
        else System.out.println(0);

        System.out.println();
    }
}
