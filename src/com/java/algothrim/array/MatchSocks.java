package com.java.algothrim.array;

import java.util.*;

//https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class MatchSocks {
    static int sockMerchant(int n, int[] ar) {
        int pairCount = 0;

        Map<Integer,Integer> sockMap = new HashMap<>();

        for (int i: ar) {
            if(sockMap.containsKey(i)){
                sockMap.put(i,sockMap.get(i)+1);
            }else{
                sockMap.put(i,1);
            }
        }

        for(int i : sockMap.values()){
            pairCount = pairCount + i/2;
        }

        return  pairCount;
    }
}
