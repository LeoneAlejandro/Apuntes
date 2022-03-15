package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int min = sc.nextInt();
            int max = sc.nextInt();
            int count = 0;
            for (int i = min; i <= max; i++) {
                long pow = (long) i * i;
                double len = (String.valueOf(pow).length());
                int hlen = (int) Math.ceil(len/2);
                int l = (int) (pow / Math.pow(10, hlen));
                int r = (int) (pow % Math.pow(10, hlen));
                if (l+r == i){
                    System.out.print(i + " ");
                    count++;
                }
            }
            if (count==0) System.out.println("INVALID RANGE");
        }
    }
