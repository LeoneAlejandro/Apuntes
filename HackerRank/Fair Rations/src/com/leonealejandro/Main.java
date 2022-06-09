package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), next, dist = 0, par = 0;
//        int [] list = new int[n];
        for (int i = 0; i < n; i++) {
            next = sc.nextInt();
            if (next%2!=0){
                par++;
            }
            if (par%2!=0){
                dist++;
            }
        }
        if (par%2==0){
            System.out.println((dist)*2);
        } else System.out.println("NO");
    }
}
