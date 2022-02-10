package com.leonealejandro;

import java.util.Scanner;

public class Main {

    static int reverseNumber (int input){
        int num = 0;
        int digit;
        while (input!=0){
            digit = input % 10;
            num = num * 10 + digit;
            input = input / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ni = sc.nextInt();
        int nf = sc.nextInt();
        int div = sc.nextInt();
        int count = 0;

        for (int i = ni; i <= nf; i++) {
            if (Math.abs((i - reverseNumber(i)) % div) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
