package com.leonealejandro;

public class Student {
    private String[] scoresInArray;
    private int finalScore;

    public Student(String scores) {
        this.scoresInArray = scores.split(" ");
        }

    private void scoreCalculator(){
        for (int i = 0; i < scoresInArray.length-1; i++) {
            finalScore = finalScore + Integer.parseInt(scoresInArray[i]);
        }
        finalScore = finalScore / scoresInArray.length;
        }

    public void scoreGrader(){
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
