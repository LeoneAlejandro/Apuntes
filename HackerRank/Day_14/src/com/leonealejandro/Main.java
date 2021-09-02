package com.leonealejandro;

import java.util.Scanner;

class Difference{
    int[] _elements;
    int maximumDifference;
    int temp;

    public Difference(int[] _elements) {
        this._elements = _elements;
    }

    void computeDifference(){
        for (int j = 0; j < _elements.length; j++) {
            for (int i = 0; i < _elements.length - 1; i++) {
                temp = Math.abs(_elements[j]) - Math.abs(_elements[i]);
                if (Math.abs(temp) > maximumDifference)
                    maximumDifference = Math.abs(temp);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
