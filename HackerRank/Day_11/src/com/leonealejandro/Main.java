package com.leonealejandro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, 6).forEach(i -> {
                try {
                    arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            bufferedReader.close();

            int maxNumber;
            int maximum = 0;

            for (int i = 0; i < arr.get(0).size()-2; i++) {
                for (int j = 0; j < arr.size()-2; j++) {
                    maxNumber = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                    maxNumber += arr.get(i+1).get(j+1);
                    maxNumber += arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                    if (maxNumber > maximum){
                        maximum = maxNumber;
                    }
                }
            }
            System.out.println(maximum);
        }

    }