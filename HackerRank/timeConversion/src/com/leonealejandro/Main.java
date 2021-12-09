package com.leonealejandro;

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

       public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
           char D = s.charAt(s.length()-2);
           s = s.substring(0, s.length()-2);
           String[] splittedString = s.split(":");
           int hour = parseInt(splittedString[0]);
           int min = parseInt(splittedString[1]);
           int sec = parseInt(splittedString[2]);
           if (D=='P' && hour!=12) { hour += 12;}
           if (D=='A' && hour==12) { hour = 0;}
           String newTime = String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec);
           System.out.println(newTime);
        }
    }
