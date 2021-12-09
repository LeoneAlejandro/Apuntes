package com.leonealejandro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        int result = (x1+v1) - (x2+v2);
        int var=1;

        if((x2 - x1) * (v2 - v1) < 0 && (x2 - x1) % (v2 - v1) == 0){
            System.out.println("YES");
        } else System.out.println("NO");

    }
}
