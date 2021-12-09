package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantM=0;
        int cantN=0;
        int[] casa = new int[2];
        for (int i = 0; i < 2; i++) {
            casa[i] = sc.nextInt();}
        int aManzana = sc.nextInt();
        int aNaranja = sc.nextInt();
        int[] manzanas = new int[sc.nextInt()];
        int[] naranajas = new int[sc.nextInt()];
        for (int i = 0; i < manzanas.length; i++) {
            manzanas[i] = sc.nextInt();
        }
        for (int i = 0; i < naranajas.length; i++) {
            naranajas[i] = sc.nextInt();
        }
        for (int i = 0; i < manzanas.length; i++) {
            if ((manzanas[i]+aManzana) >= casa[0] && (manzanas[i]+aManzana) <= casa[1]){ cantM++;}
        }
        for (int i = 0; i < naranajas.length; i++) {
            if ((naranajas[i]+aNaranja)<=casa[1] && (naranajas[i]+aNaranja) >= casa[0]){cantN++;}
        }
        System.out.println(cantM);
        System.out.println(cantN);
    }
}
