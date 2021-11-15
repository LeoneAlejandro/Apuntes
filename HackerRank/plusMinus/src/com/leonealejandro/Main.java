package com.leonealejandro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        DecimalFormat df = new DecimalFormat("#.0000");
        float positivos = 0;
        float negativos = 0;
        float ceros = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>0){positivos ++;}
            if (arr.get(i)<0){negativos++;}
            if (arr.get(i)==0){ceros++;}
        }
        System.out.println(df.format(positivos/arr.size()));
        System.out.println(df.format(negativos/arr.size()));
        System.out.println(df.format(ceros/arr.size()));
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}