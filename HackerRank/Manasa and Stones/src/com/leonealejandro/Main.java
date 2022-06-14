package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            for (int j = 0; j < n; j++) {
                if(a-b==0) j=n;
                System.out.print((min*(n-j-1))+(max*j)+" ");
            }
            System.out.println();
        }
    }
}
