package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int k = sc.nextInt();
        int i = 0;
        int min = Math.min(s.length(), t.length());

        while(i < min && s.charAt(i)==t.charAt(i) ){
            i++;
        }
        int amount = s.length()-i + t.length()-i;
        if (((amount-k)%2==0 && k>= amount) || s.length() + t.length() <= k) System.out.println("Yes");
        else System.out.println("No");
    }
}
