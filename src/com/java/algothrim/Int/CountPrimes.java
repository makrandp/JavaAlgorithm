package com.java.algothrim.Int;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountPrimes {
    //https://leetcode.com/problems/count-primes/

    //https://www.youtube.com/watch?v=eKp56OLhoQs
    public static int countPrimes(int n) {

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);

        int count  = 0;

        for (int i = 2 ; i < n ; i ++){
            if(isPrime[i]){
                System.out.println("prime = " + i);
                count ++;
                for(int j = 2; i * j < n ; j ++){
                    isPrime[i*j] = false;
                }
            }

        }
        return count;
    }


    public static void testLoop(int n){
        for(int i = n; i < n ; i ++){
            System.out.println( "xxxxxxxxxxxxx ");
        }
    }

}
