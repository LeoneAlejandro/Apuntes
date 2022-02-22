package com.leonealejandro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        int max = 0;
        int tot = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int count = 0;
                for (int l = 0; l < k; l++) {
                    if (list.get(i).charAt(l) == '1' || list.get(j).charAt(l) == '1'){
                        count++;
                    }
                }
                if (count>max) {
                    max = count;
                    tot = 1;
                } else if (count == max) tot ++;
            }
        }System.out.println(max);
        System.out.println(tot);

    }
}
