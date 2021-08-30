package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        int n = scanner.nextInt();scanner.nextLine();
        String scores = scanner.nextLine();
        var student1 = new Student(data, scores);

        System.out.println(scores.toString());
        System.out.println("Name: " + student1.getFirstName() + ", " + student1.getLastname());
        System.out.println("ID: " + student1.getIdNumber());
        student1.scoreGrader();
    }

}
