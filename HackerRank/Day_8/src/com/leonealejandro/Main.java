package com.leonealejandro;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String var;
        String[] varInString;
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            var = scanner.nextLine();
            varInString = var.split(" ");
            phoneBook.put(varInString[0], Integer.parseInt(varInString[1]));
            }

        while(scanner.hasNext())
        for (int i = 0; i < n; i++) {
            String key = scanner.next();
            if (phoneBook.get(key) != null)
            System.out.println(key + "=" + phoneBook.get(key));
            else System.out.println("Not found");
            }
        }
    }

