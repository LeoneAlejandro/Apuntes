package com.leonealejandro;

import java.util.Scanner;

public class Main {
    static int resultado = 1;

    public static int factorial(int n) {
        for (int i = n; i > 0; i--) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
        System.out.println(factorial(n));
    }


}
