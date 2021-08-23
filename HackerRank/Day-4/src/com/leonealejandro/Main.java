package com.leonealejandro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {

            class Person {

                public static int constructor(int initialAge) {
                    int age;
                    if (initialAge > 0) {
                        age = initialAge;
                    } else {
                        System.out.println("Age is not valid, setting age to 0.");
                        age = 0;
                    }return age;
                }

                public static void yearPasses(int age){
                    age = age++;
                }

                public static void  imOld(int age){
                    if (age >= 13)
                        if (age < 18)
                            System.out.println("You are Teenager.");
                        else
                            System.out.println("You are Old");
                    else
                        System.out.println("You are young.");
                }

            }

            System.out.print("Insert age: ");
            Scanner scanner = new Scanner(System.in);
            int initialAge = scanner.nextInt();

            Person.imOld(Person.constructor(initialAge));
        }
    }

}
