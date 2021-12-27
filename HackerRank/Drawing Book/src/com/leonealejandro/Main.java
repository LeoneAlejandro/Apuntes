package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int frontcount;
        int backcount;

        frontcount = k/2;

        if (n%2==0){
            backcount = (n-k+1)/2;
        } else { backcount = (n-k)/2;}

        System.out.println(backcount<frontcount ? backcount : frontcount);
    }
}
