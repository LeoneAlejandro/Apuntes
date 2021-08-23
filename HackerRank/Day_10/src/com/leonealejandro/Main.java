package com.leonealejandro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String resultado = new String();

        while (n != 0) {
            if (n % 2 != 0){
                resultado = 1 + resultado;
                n = n/2;

            }else {
                resultado = 0 + resultado;
                n = n / 2;
            }
        }
        System.out.println(resultado);
        bufferedReader.close();

        int cant = 1;
        int viejaCant = 0;

        for (int i = 0; i < resultado.length()-1; i++) {
            if (resultado.charAt(i) == 49 && resultado.charAt(i+1) == 49){
                cant = cant + 1 ;
            }else
                if (cant > viejaCant){
                viejaCant = cant;
                cant = 1;
            }else cant =1;
        }


        System.out.println(viejaCant);

        if (viejaCant > cant)
        System.out.println(viejaCant);
        else System.out.println(cant);
        }
}
