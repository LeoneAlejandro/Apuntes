package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reps = sc.nextInt();
        for (int i = 0; i < reps; i++) {
            int pri = sc.nextInt();
            int candys = sc.nextInt();
            int start = sc.nextInt();

            int n = start + candys - 1;
            int div = n/pri;
            int result = Math.abs(n-(div*pri));
            if (result!=0){
                System.out.println(result);
            } else System.out.println(pri);
        }
    }
}
