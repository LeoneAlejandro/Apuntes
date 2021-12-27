package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int abill = 0;
        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            if ( i != k){
                abill += price;
            }
	    }
        int bbill = sc.nextInt();
        System.out.println(abill/2 == bbill ? "Bon Appetit" : bbill-(abill/2));
    }
}
