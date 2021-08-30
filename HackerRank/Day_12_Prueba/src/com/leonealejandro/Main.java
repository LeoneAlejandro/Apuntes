package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        var person1 = new Person(data);
        int n = scanner.nextInt();
        scanner.nextLine();
        String scores = scanner.nextLine();
        var student1 = new Student(scores);

        System.out.println("Name: " + person1.getLastname() + ", " + person1.getFirstName());
        System.out.println("ID: " + person1.getIdNumber());
        student1.scoreGrader();
    }


    public static class Person {
        private String firstName;
        private String lastname;
        private int idNumber;
        private int[] scores;

        public Person(String data) {
            dataSplitter(data);
        }

        private void dataSplitter(String data) {
            String[] dataInArray = data.split(" ");
            this.firstName = dataInArray[0];
            this.lastname = dataInArray[1];
            this.idNumber = Integer.parseInt(dataInArray[2]);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastname() {
            return lastname;
        }

        public int getIdNumber() {
            return idNumber;
        }
    }

    public static class Student {
        private String[] scoresInArray;
        private int finalScore;

        public Student(String scores) {
            this.scoresInArray = scores.split(" ");
        }

        private void scoreCalculator(){
            for (int i = 0; i < scoresInArray.length; i++) {
                finalScore = finalScore + Integer.parseInt(scoresInArray[i]);
            }
            finalScore = finalScore / scoresInArray.length;
        }

        public void scoreGrader(){
            scoreCalculator();
            if (finalScore < 40)
                System.out.println("Grade: T");
            System.out.println(finalScore);
            if (40 <= finalScore && finalScore < 55)
                System.out.println("Grade: D");
            if (55 <= finalScore && finalScore < 70)
                System.out.println("Grade: P");
            if (70 <= finalScore && finalScore < 80)
                System.out.println("Grade: A");
            if (80 <= finalScore && finalScore < 90)
                System.out.println("Grade: E");
            if (90 <= finalScore && finalScore <= 100)
                System.out.println("Grade: O");
        }
    }
}
