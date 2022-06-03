package com.leonealejandro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int mindist = Integer.MAX_VALUE;
        int dist;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (list.contains(num)){
                dist = i - list.indexOf(num);
                mindist = Math.min(dist, mindist);
            }
            list.add(num);
        }
        if (mindist == Integer.MAX_VALUE) System.out.println("-1");
        else System.out.println(mindist);
    }
}
