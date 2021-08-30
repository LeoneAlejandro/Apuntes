package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	String data = scanner.nextLine();
	String[] dataInArray = data.split(" ");
    String firstName = dataInArray[0];
    String lastName = dataInArray[1];

    int idNumber = Integer.parseInt(dataInArray[2]);
    int n = scanner.nextInt();

    String[] scores;
    scanner.nextLine();
    data = scanner.nextLine();
    dataInArray = data.split(" ");
    int finalScore = 0;
        for (int i = 0; i < n; i++) {
        finalScore = finalScore + Integer.parseInt(dataInArray[i]);
        }

        finalScore = finalScore / n;


        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);


            if (finalScore < 40)
                System.out.println("Grade : T");
            if (40 <= finalScore && finalScore < 55)
                System.out.println("Grade : D");
            if (55 <= finalScore && finalScore < 70)
                System.out.println("Grade : P");
            if (70 <= finalScore && finalScore < 80)
                System.out.println("Grade : A");
            if (80 <= finalScore && finalScore < 90)
                System.out.println("Grade : E");
            if (90 <= finalScore && finalScore <= 100)
                System.out.println("Grade : O");
        }


}

