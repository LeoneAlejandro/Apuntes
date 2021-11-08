package com.leonealejandro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Integer> date = new ArrayList<>();
    List<Integer> due = new ArrayList<>();
    int fine = 0;
    String var;
    String[] varInString;
    var=sc.nextLine();
    varInString = var.split("\\s+");
    for (int i = 0; i < 3; i++) {
        date.add(Integer.parseInt(varInString[i]));
    }
    var=sc.nextLine();
    varInString = var.split("\\s+");
    for (int i = 0; i < 3; i++) {
        due.add(Integer.parseInt(varInString[i]));
    }

    if (date.get(2)>due.get(2)){
        fine=10_000;
    } else  if ((date.get(2)-due.get(2))==0 && date.get(1)>due.get(1)){
        fine=500*(date.get(1)-due.get(1));
    } else  if ((date.get(2)-due.get(2))==0 && (date.get(1)-due.get(1))==0 && date.get(0)>due.get(0)){
        fine=15*(date.get(0)-due.get(0));
    }

    System.out.println(fine);
    }
}

