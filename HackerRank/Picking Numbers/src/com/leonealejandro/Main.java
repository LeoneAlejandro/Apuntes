package com.leonealejandro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int max = 0;
        int count = 0;
        for (int i = 0; i < n-1; i++) {

            for(int j=i;j<n;j++){
                if(arr[j]-arr[i]<=1){
                    count++;
            } if (count>max) max = count; count = 0;
        }
        System.out.println(max);
    }
}
}
