package com.leonealejandro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Result {

    public static void staircase(int n) {
        for (int i = 1; i < n+1; i++) {
            String renglon;
            renglon = String.join("",Collections.nCopies(n-i," "));
            renglon = renglon + String.join("",Collections.nCopies(i,"#"));
            System.out.println(renglon);
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
