package com.java.algothrim.String;

public class DetermineIfOneStringIsAnotherSubstring {

    public int solution(String s1,String s2){

        if(s2.length() > s1.length()){
            return solution(s2,s1);
        }

        return s1.indexOf(s2);
    }
}
