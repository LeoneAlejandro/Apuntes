package com.leonealejandro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        double L = Math.sqrt(s.length());

        double col = Math.ceil(L);
        double row = Math.ceil(L);

        if (col * row < L){
            row+=1;
        }

        String result = new String();
        int n = 0;
        for (int i = 0; i < row; i++) {
            while(i+n < s.length()){
                result += s.charAt(i+n);
                n+=col;
            }
            result += " ";
            n = 0;
        }
        System.out.println(result);
    }
}
