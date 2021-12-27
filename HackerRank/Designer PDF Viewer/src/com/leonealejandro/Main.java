package com.leonealejandro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (sc.hasNextInt()){
            numbers.add(sc.nextInt());
        }
        sc.nextLine();
        String word = sc.nextLine();

        int max = 0;
        int currCharValue;
        for (int i = 0; i < word.length(); i++) {
            currCharValue = numbers.get((int) word.charAt(i) - 'a');
            if (max<currCharValue) max=currCharValue;
        }
        System.out.println(max*word.length());

    }
}
