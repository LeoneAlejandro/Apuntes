package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        String[] simples = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
                "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"};

        if (m==0) System.out.println(simples[h] + " o' clock");
        if (m<=29 && m>= 2 || m!=15) System.out.println(simples[m] + " minutes past " + simples[h]);
        if (m==15 || m==30) System.out.println(simples[m]+ " past " + simples[h]);
        if (m>30 && m!=45) System.out.println(simples[simples.length+29-m] + " minutes to " + simples[h+1]);
        if (m == 45) System.out.println(simples[simples.length+29-m] + " to " + simples[h+1]);
        if (m==1) System.out.println(simples[m] + " minute past " + simples[h]);
    }
}
