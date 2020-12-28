package com.java.algothrim.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class CountVally {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int vallyCount = 0;
        int altitude = 0;
        boolean isVally = false;

        for (char ch: path.toCharArray()) {
            if(ch == 'U'){
                altitude ++;
            }
            if(ch == 'D'){
                altitude --;
            }


            if(isVally && altitude >= 0){
                vallyCount++;
            }

            isVally = altitude < 0;


        }

        return vallyCount;
    }

}


