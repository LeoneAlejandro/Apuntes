package com.leonealejandro;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(!map.containsKey(temp)){
                map.put(temp, 1);
            } else {map.put(temp, map.get(temp)+1);
                if (max < map.get(temp))
                    max = map.get(temp);
            }
        }
        System.out.println(n-max);

//        int mostCommon = 0;
//        for (Integer key : map.keySet()) {
//            if(map.get(key)>mostCommon) mostCommon = map.get(key);
//        }
//        System.out.println(n-mostCommon);
    }
}
