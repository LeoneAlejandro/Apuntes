package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
        int count = 0;
        sc.nextLine();
        String mov = sc.nextLine();
        int valleys = 0;
	    for (int i = 0; i < mov.length(); i++) {
            if (mov.charAt(i) == 'D'){ count -= 1;
            } else { count += 1;}
            if (count==0 && mov.charAt(i)=='U'){
                valleys += 1;Electronics Shop


            }
        }
        System.out.println(valleys);
    }
}
