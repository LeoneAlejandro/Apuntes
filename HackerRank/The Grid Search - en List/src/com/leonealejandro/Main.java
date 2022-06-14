package com.leonealejandro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in  );
        ArrayList<String> Grid = new ArrayList<>();
        ArrayList<String> Pattern = new ArrayList<>();
        int n = sc.nextInt();
        //#DECASOS
        for (int i = 0; i < n; i++) {
            //SETEO DE GRID
            int gn = sc.nextInt(), gm = sc.nextInt();
            for (int j = 0; j < gn; j++) {
                Grid.add(sc.next());
            }
            //SETEO DE PETTERN A BUSCAR
            int pn = sc.nextInt(), pm = sc.nextInt();
            for (int j = 0; j < pn; j++) {
                Pattern.add(sc.next());
            }
            //BUSQUEDA DE PATTERN EN GRID




        }//NO SALIR DE ESTE FOR
    }
}
