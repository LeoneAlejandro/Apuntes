package com.leonealejandro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cobst = sc.nextInt();
        int rQ = sc.nextInt();
        int cQ = sc.nextInt();
        int[][] obst = new int[cobst][2];
        for (int i = 0; i < cobst; i++) {
            obst[i][0] = sc.nextInt();
            obst[i][1] = sc.nextInt();
        }

        int upobst = n - rQ;
        int downobst = rQ - 1;
        int rightobst = n - cQ;
        int leftobst = cQ - 1;
        int urobst = n - Math.max(rQ, cQ);
        int ulobst = Math.min(n-rQ, Math.abs(1-cQ));
        int drobst = Math.min(n-cQ, rQ-1);
        int dlobst = Math.min(rQ, cQ) - 1;

        for (int i = 0; i < cobst; i++) {
            int rO = obst[i][0];
            int cO = obst[i][1];

            if ((rO == rQ && cO>cQ) && cO-cQ<rightobst){
                rightobst = cO - cQ-1;
            } else if ((rO == rQ && cO<cQ) && cQ-cO<leftobst) {
                leftobst = cQ - cO-1;
            } else if ((cO==cQ && rO<rQ) && rQ-rO<downobst){
                downobst = rQ-rO-1;
            } else if ((cO==cQ && rO>rQ) && rO-rQ<upobst){
                upobst = rO-rQ-1;
            }else if ((rO>rQ && cO>cQ) && (rO-rQ==cO-cQ) && rO-rQ<urobst){
                urobst = rO-rQ-1;
            }else if ((rO>rQ && cO<cQ) && (rO-rQ==cQ-cO) && rO-rQ<ulobst){
                ulobst = rO-rQ-1;
            }else if ((rO<rQ && cO>cQ) && (rQ-rO==cO-cQ) && rQ-rO<drobst){
                drobst = rQ-rO-1;
            }else if ((rO<rQ && cO<cQ) && (cQ-cO==rQ-rO) && rQ-rO<dlobst){
                dlobst = rQ-rO-1;
            }
        }
        int sum = upobst + downobst + rightobst + leftobst + urobst + ulobst + drobst + dlobst;
        System.out.println(sum);

    }
}
