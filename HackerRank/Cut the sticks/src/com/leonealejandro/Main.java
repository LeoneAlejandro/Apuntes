package com.leonealejandro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        while (!arr.isEmpty()){
            int min = Collections.min(arr);
            int size = arr.size();
            System.out.println(size);
            for (int i = 0; i < size; i++) {
                if (arr.get(0)-min>0) {
                    arr.add(arr.get(0)-min);
                }
                arr.remove(0);
            }
        }
    }
}
