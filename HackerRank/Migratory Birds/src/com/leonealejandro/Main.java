package com.leonealejandro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> birds = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (birds.containsKey(arr[i])){
                birds.put(arr[i], birds.get(arr[i]) + 1);
            } else { birds.put(arr[i],1); }
        }
        System.out.println(Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}
