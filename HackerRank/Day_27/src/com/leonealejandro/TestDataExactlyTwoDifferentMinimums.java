package com.leonealejandro;

public class TestDataExactlyTwoDifferentMinimums {
    static int result;
    public static int[] get_array(){
        int[] arrayWithTwoUniqueValues = new int[10];
        arrayWithTwoUniqueValues[0] = 1;
        for (int i = 1; i < 10 ; i++) {
            arrayWithTwoUniqueValues[i]=i-1;
        }
        arrayWithTwoUniqueValues[0] = result;
        return arrayWithTwoUniqueValues;
    }

    public static int get_expected_result(){
        return result;
    }
}
