package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int scores[] = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int minScore = scores[0];
        int maxScore = scores[0];
        int minScoreCount = 0;
        int maxScoreCount = 0;
        for (int i = 1; i <= n-1; i++) {
            if (scores[i] < minScore){
                minScore = scores[i];
                minScoreCount++;
            } else  if (scores[i] > maxScore){
                maxScore = scores[i];
                maxScoreCount++;
            }

        }
        System.out.println(maxScoreCount+" "+minScoreCount);
    }
}
