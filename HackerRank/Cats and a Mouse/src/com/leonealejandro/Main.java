package com.leonealejandro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int CatA = sc.nextInt();
            int CatB = sc.nextInt();
            int MouseC = sc.nextInt();

            if (Math.abs(CatA-MouseC)<Math.abs(CatB-MouseC)) System.out.println("Cat A");
            if (Math.abs(CatA-MouseC)>Math.abs(CatB-MouseC)) System.out.println("Cat B");
            if (Math.abs(CatA-MouseC)==Math.abs(CatB-MouseC)) System.out.println("Mouse C");

        }
    }
}
