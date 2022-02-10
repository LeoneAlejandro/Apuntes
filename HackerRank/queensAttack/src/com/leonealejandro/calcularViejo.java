package com.leonealejandro;

import java.util.Arrays;
import java.util.Scanner;

public class calcularViejo {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cobst = sc.nextInt();
    int r = sc.nextInt()-1;
    int c = sc.nextInt()-1;
    int[][] board = new int[n][n];
    board[r][c] = 1;
    int[][] obst = new int[cobst][2];
        for (int i = 0; i < cobst; i++) {
        obst[i][0] = sc.nextInt()-1;
        obst[i][1] = sc.nextInt()-1;
    }

        for (int i = 0; i < n; i++) {
        board[i][c] = 1;
        board[r][i] = 1;
        if (r-i<n && c-i<n && r-i>=0 && c-i>=0) board[r-i][c-i]=1;
        if (r+i<n && c-i<n && r+i>=0 && c-i>=0) board[r+i][c-i]=1;
        if (r-i<n && c+i<n && r-i>=0 && c+i>=0) board[r-i][c+i]=1;
        if (r+i<n && c+i<n && r+i>=0 && c+i>=0) board[r+i][c+i]=1;
    }

        for (int i = 0; i < cobst; i++) {
        board[obst[i][0]][obst[i][1]]=2;
    }

    board[r][c] = 8;

    int count = 0;
    int i = 0;
        while(r+i+1<n && board[r+i+1][c]!=2){
        i++;
        count++;
    }
    i=0;
        while(r-i-1>=0 && board[r-i-1][c]!=2){
        i++;
        count++;
    }
    i = 0;
        while(c+i+1<n && board[r][c+i+1]!=2){
        i++;
        count++;
    }
    i=0;
        while(c-i-1>=0 && board[r][c-i-1]!=2){
        i++;
        count++;
    }

    i = 0;
        while (r-i-1>=0 && c-i-1>=0 && board[r-i-1][c-i-1]!=2){
        count++;
        i++;
    }
    i = 0;
        while (r+i+1<n && c+i+1<n && board[r+i+1][c+i+1]!=2){
        count++;
        i++;
    }
    i = 0;
        while (r-i-1>=0 && c+i+1<n && board[r-i-1][c+i+1]!=2){
        count++;
        i++;
    }
    i = 0;
          while (r+i+1<n && c-i-1>=0 && board[r+i+1][c-i-1]!=2){
        count++;
        i++;
    }



        System.out.println(Arrays.deepToString(board)
            .replace("],","\n").replace(",","\t|")
                .replaceAll("[\\[\\]]", " "));
        System.out.println(" ");
        System.out.println(count);

}
