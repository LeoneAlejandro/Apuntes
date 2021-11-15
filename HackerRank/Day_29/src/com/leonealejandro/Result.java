package com.leonealejandro;

public class Result {

    public static int bitwiseAnd(int N, int K) {
        int max = 0;
        for (int a = 1; a <= N; a++) {
            for (int b = a+1; b <= N; b++) {
                int binaryAB = a&b;
                if (binaryAB>max && binaryAB < K){
                    max = binaryAB;
                }
            }
        }
        return max;
    }

}
