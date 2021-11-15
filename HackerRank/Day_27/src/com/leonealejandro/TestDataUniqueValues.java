package com.leonealejandro;

public class TestDataUniqueValues {
    public static int[] get_array(){
        int[] arrayWithUniqueValues = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayWithUniqueValues[i] = i;
        }
        return arrayWithUniqueValues;
    }

    public static int get_expected_result(){
        return 0;
    }

}
