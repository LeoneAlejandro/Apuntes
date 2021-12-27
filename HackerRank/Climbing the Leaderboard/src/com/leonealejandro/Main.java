package com.leonealejandro;

import java.util.*;

public class Main {

    static int getPlace(int currPlace, int player, List<Integer> scores){
        for(int i = currPlace - 1; i > 0; i--){
            int index = i - 1;
            if(player < scores.get(index)){
                return i + 1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> scores = new ArrayList<>();
        int place = 1;
        scores.add(sc.nextInt());
        for(int i = 1; i < n; i++){
            int currScore = sc.nextInt();
            if(currScore != scores.get(place-1)){
                place++;
                scores.add(currScore);
            }
        }

        int k = sc.nextInt();
        int[] player = new int[k];
        for (int i = 0; i < k; i++) {
            player[i]=sc.nextInt();
        }

        System.out.println(scores);

        int currPlace = scores.size() + 1;
        for(int i = 0; i < player.length; i++){
            currPlace = getPlace(currPlace, player[i], scores);
            System.out.println(currPlace);
        }

    }
}
