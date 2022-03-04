package com.leonealejandro;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        for (int k = 0; k < n; k++) {
            String s = sc.nextLine();
            char temp = 0;
            int pos = 0;

            List<Character> stoList = new ArrayList<Character>();
            for (char ch : s.toCharArray()){
                stoList.add(ch);
            }

            for (int i = s.length()-1; i >= 0; i--) {
                for (int j = i-1; j >= 0 ; j--) {
                    if (stoList.get(i) > stoList.get(j)) {
                        temp = stoList.get(i);
                        stoList.remove(i);
                        stoList.add(j, temp);
                        temp = 1;
                        pos = j;
                        break;
                    }
                    if (temp == 1) break;
                }
                if (temp == 1) break;
            }

            if (temp == 0) System.out.println("no answer");
            else {
                Collections.sort(stoList.subList(pos+1, s.length()));
                System.out.println(stoList.toString().replaceAll("\\[|\\]", "").replaceAll(", ",""));
            }

        }
    }
}
