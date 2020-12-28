package com.java.algothrim.String;

//https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class RepeatedString {
    public static long repeatedString(String s, long n) {
        String repeatedString = "";
        long count = 0;
        long countInSingleString = 0;

        for (char c: s.toCharArray()) {
            if(c == 'a'){
                countInSingleString++;
            }
        }


        count = (countInSingleString * (n / s.length()));


        for(int j = 0; j < n %s.length() ; j++){
            if(s.toCharArray()[j] == 'a'){
                count++;
            }
        }

        return count;

    }
}
