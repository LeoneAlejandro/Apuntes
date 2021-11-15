package com.leonealejandro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Result {

        public static void extraLongFactorials(int n) {
            BigInteger result = new BigInteger("1");
            while (n>1){
                n=n-1;
                result = result.multiply(BigInteger.valueOf(n));
            }
            System.out.println(result);;
        }

    }

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            Result.extraLongFactorials(n);

            bufferedReader.close();
        }

}
