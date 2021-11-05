package com.leonealejandro;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int c = sc.nextInt();
    	for (int i = 0; i < c ; i++) {
			int n = sc.nextInt();
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(n) ; j++) {
				if(n%j==0){
					isPrime = false;
					break;
				}
			}
			if (!isPrime || n==1){
			System.out.println("Not prime");
			} else {
				System.out.println("Prime");
			}
		}
    }
}

