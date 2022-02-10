package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer num = sc.nextInt();
            String numtosting = num.toString();
            int count = 0;
            for (int j = 0; j < numtosting.length(); j++) {
                int d = Integer.parseInt(String.valueOf(numtosting.charAt(j)));
                if (d!=0 && num%d==0) count++;
            }
            System.out.println(count);
        }
    }
}
