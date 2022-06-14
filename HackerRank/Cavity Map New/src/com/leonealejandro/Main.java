package com.leonealejandro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(), x=0;
	    char [][] map = new char [n][n];
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = temp.charAt(j);
            }
        }
        ArrayList<Integer> saved = new ArrayList<>();
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                char pos = map[i][j];
                if (pos>map[i-1][j] && pos>map[i+1][j] && pos>map[i][j+1] && pos>map[i][j-1]){
                    saved.add(i);
                    saved.add(j);
                }
            }
        }
        for (int i = 0; i < saved.size(); i=i+2) {
            map[saved.get(i)][saved.get(i+1)] = 'X';
        }
        System.out.println(Arrays.deepToString(map).replace("[","").replace("],","\n").replace(", ","").replace("]","").replace(" ","").trim());
    }
}
