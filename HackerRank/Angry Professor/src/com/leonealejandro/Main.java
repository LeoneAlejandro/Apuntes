package com.leonealejandro;

import java.util.Scanner;

public class Main {

//    static void doesClasesStart (int[] students, int a){
//        int count = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i]<=0) count++;
//        }
//        if (count>=a) {
//            System.out.println("NO");
//        }else System.out.println("YES");
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reps = sc.nextInt();
        for (int i = 0; i < reps; i++) {

            int n = sc.nextInt();
            int a = sc.nextInt();
            int next;
            int count = 0;
            for (int j = 0; j < n; j++) {
                next = sc.nextInt();
                if (next<=0) count++;
            }
            if (count>=a) System.out.println("NO");
            else System.out.println("YES");

//            int[] students = new int[n];
//            for (int j = 0; j < n; j++) {
//                students[j] = sc.nextInt();
//            }
//            doesClasesStart(students, a);
        }
    }
}
