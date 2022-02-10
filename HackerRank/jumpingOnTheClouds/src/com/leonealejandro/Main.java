package com.leonealejandro;

import java.util.Scanner;



public class Main {

    public static int jumpingClouds(int[] clouds){
        int count = 0;

        for (int i = 0; i < clouds.length-1; i++) {
            if (i<clouds.length-2 && clouds[i+2]!=1){
                i++;
            } count++;
        }

        return count;
    }

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] clouds = new int[n];
        for (int i = 0; i < n; i++) {
            clouds[i] = sc.nextInt();
        }
        System.out.println(jumpingClouds(clouds));
    }
}
