package com.leonealejandro;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int y = sc.nextInt();

	    if (y<=1917){
	        if (y%4==0){
                System.out.println("12.09."+y);
            } else {
                System.out.println("13.09."+y);
            }
        }
	    if (y>1918){
	        if (Year.isLeap(y)){
                System.out.println("12.09."+y);
            } else {
                System.out.println("13.09."+y);
            }
        }
	    if (y==1918){
            System.out.println("26.09."+y);
        }
    }
}
