package com.leonealejandro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b;
        List<Integer> grades = new ArrayList<>();
        while (n-->0){
            grades.add(sc.nextInt());
        }
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i)>=38){
                b = (int) Math.ceil((double)grades.get(i)/5);
                if ((b*5)-grades.get(i)<3){
                    System.out.println(b*5);
                } else System.out.println(grades.get(i));
            }else System.out.println(grades.get(i));
        }

    }
}
