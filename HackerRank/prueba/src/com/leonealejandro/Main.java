package com.leonealejandro;

public class Main {

    public static void main(String[] args) {

    int N = 5;
        for (int a = 1; a <= N; a++) {
            for (int b = a+1; b <= N; b++) {
                int temp = a&b;
                System.out.println("A="+ a + "  B=" + b + "  TEMP=" + temp);

    }
}
    }
}
