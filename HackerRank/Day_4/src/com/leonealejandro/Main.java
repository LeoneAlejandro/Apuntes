package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Inserta edad");
            int age = scanner.nextInt();

            if (age >= 13) {
                if (age < 18) {
                    System.out.println("You are a teenager.");
                } else
                    System.out.println("You are old.");
            } else
                System.out.println("You are young.");
            if (age >= 100)
                break;
        }
    }
}
