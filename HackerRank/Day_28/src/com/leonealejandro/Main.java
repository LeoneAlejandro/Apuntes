package com.leonealejandro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cant = sc.nextInt();
        String data;
        ArrayList<String> results = new ArrayList<String>();
        while (cant-- >= 0){
            data = sc.nextLine();
            Pattern p = Pattern.compile("gmail.com");
            Matcher m = p.matcher(data);
            if (m.find()){
                String[] name = data.split(" ");
                results.add(name[0].toString());
            }
        }
        Collections.sort(results);
        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }
}

