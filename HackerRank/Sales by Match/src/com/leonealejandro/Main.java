package com.leonealejandro;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
        int sock;
        int count = 0;
        HashMap<Integer, Integer> List = new HashMap<>();
	    for (int i = 0; i < n; i++) {
            sock = sc.nextInt();
	        if (List.containsKey(sock)){
                List.put(sock, List.get(sock)+1);
            } else { List.put(sock, 1);}
        }
        for(Map.Entry<Integer, Integer> entry : List.entrySet()) {
            int value = entry.getValue();
            if (value/2>=1){
                count = count + value/2;
            }
        }
        System.out.println(count);
    }
}

