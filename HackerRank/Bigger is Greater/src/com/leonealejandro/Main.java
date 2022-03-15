package com.leonealejandro;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();

        for (int k = 0; k < n; k++) {
            String s = sc.nextLine();
            char[] stoArray = s.toCharArray();

            int i = s.length()-1;
            while (i>1 && stoArray[i-1] >= stoArray[i]){
                i--;
            }
            if (i<=0){
                System.out.println("no answer");
            } else {
            int j = s.length()-1;
            while (j>0 && stoArray[j]<=stoArray[i-1]){
                j--;
            }
            if (j<i){
                System.out.println("no answer");}
            else {
            char temp = stoArray[i-1];
            stoArray[i-1] = stoArray[j];
            stoArray[j] = temp;

            j = s.length()-1;
            while (i<j){
                temp = stoArray[j];
                stoArray[j] = stoArray[i];
                stoArray[i] = temp;
                i++;
                j--;
            }
                System.out.println(new String(stoArray));
            }
            }
        }
    }
}
