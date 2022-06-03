package com.leonealejandro;

import java.util.*;

public class Main {

    public static List<Integer> serviceLane (List<Integer> width, List<List<Integer>> cases){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < cases.size(); i++) {
            int min = cases.get(i).get(0);
            int max = cases.get(i).get(1);
            int temp = width.get(min);
            for (int j = min+1; j <= max; j++) {
                if (width.get(j)<temp) temp = width.get(j);
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        List<Integer> width = new ArrayList<>();
        List<List<Integer>> cases = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            width.add(sc.nextInt());
        }
        for (int i = 0; i < t; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(sc.nextInt()); temp.add(sc.nextInt());
            cases.add(temp);
        }

        List<Integer> result = Main.serviceLane(width, cases);
        System.out.println(result);
    }
}
