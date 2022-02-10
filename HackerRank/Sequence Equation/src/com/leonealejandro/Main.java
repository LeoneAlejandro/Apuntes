package com.leonealejandro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        for (int i = 1; i <= list.size(); i++) {
            System.out.println(list.indexOf(list.indexOf(i)+1)+1);
        }

    }
}
