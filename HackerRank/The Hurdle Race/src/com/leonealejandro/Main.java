package com.leonealejandro;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            height.add(sc.nextInt());
        }
        int result = Collections.max(height)-max;
                if (result>0){
                    System.out.println(result);
            } else System.out.println("0");
    }
}
