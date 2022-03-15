package com.leonealejandro;

public class Result {
    public static String biggerIsGreater(String s) {
        char[] stoArray = s.toCharArray();

        int i = s.length()-1;
        while (i>1 && stoArray[i-1] >= stoArray[i]){
            i--;
        }
        if (i<=0){
            return "no answer";
        } else {
            int j = s.length()-1;
            while (stoArray[j]<=stoArray[i-1]){
                j--;
            }
            char temp = stoArray[i-1];
            stoArray[i-1] = stoArray[j];
            stoArray[j] = temp;

            j = s.length()-1;
            while (i<j){
                temp = stoArray[j];
                stoArray[j] = stoArray[i];
                stoArray[i] = temp;
                i++;
                j--;
            }
            return new String(stoArray);

        }

    }
}
