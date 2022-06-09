package com.leonealejandro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        String[] map = new String[n];
        ArrayList<Integer> saved = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            map[i]=sc.next();
        }
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                String pos = String.valueOf(map[i]);
                String posm1 = String.valueOf(map[i-1]);
                String posp1 = String.valueOf(map[i+1]);
                if (pos.charAt(j)>pos.charAt(j-1) && pos.charAt(j)>pos.charAt(j+1) &&
                        pos.charAt(j)>posm1.charAt(j) && pos.charAt(j)>posp1.charAt(j)){
                    x++;
                    saved.add(i);
                    saved.add(j);
                }
            }
        }
        for (int i = 0; i < saved.size(); i=i+2) {
            String change = String.valueOf(map[i]);
            map[saved.get(i)] = change.substring(0,saved.get(i+1))+'X'+change.substring(saved.get(i+1)+1,n);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(map[i]);
        }
    }
}
