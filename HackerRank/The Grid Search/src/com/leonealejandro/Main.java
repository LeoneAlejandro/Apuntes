package com.leonealejandro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            //Creación de la matriz madre Grid int [][]
            int fg = sc.nextInt(), cg = sc.nextInt();
            int[][] grid = new int[fg][cg];
            for (int j = 0; j < fg; j++) {
                String temp = sc.next();
                for (int k = 0; k < cg; k++) {
                    grid[j][k] = temp.charAt(k)-48;
                }
            }
            //Creación de la matriz a buscar(search) en la matriz madre (Grid) int[][]
            int fs = sc.nextInt(), cs = sc.nextInt();
            int[][] search = new int[fs][cs];
            for (int j = 0; j < fs; j++) {
                String temp = sc.next();
                for (int k = 0; k < cs; k++) {
                    search[j][k] = temp.charAt(k)-48;
                }
            }
            //Una vez que ambas matrices fueron creadas, se comienza la búsqueda de la matriz "search"
            // en la matríz madre "grid"
            for (int j = 0; j < fg-fs; j++) {
                for (int k = 0; k < cg-cs; k++) {
                    if (grid[j][k] == search[j][k]){
                        Busqueda()
                    }
                }
            }

        }
    }
}
