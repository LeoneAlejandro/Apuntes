package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();  int m1 = sc.nextInt();  int y1 = sc.nextInt();
        int d2 = sc.nextInt();  int m2 = sc.nextInt();  int y2 = sc.nextInt();

        if (y2<y1) System.out.println(10_000);
            else if (m2<m1 && y2==y1) System.out.println((m1-m2)*500);
                else if (d2<d1 && m2==m1 && y2==y1) System.out.println((d1-d2)*15);
                    else System.out.println(0);
    }
}
