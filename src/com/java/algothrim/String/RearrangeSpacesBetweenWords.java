package com.java.algothrim.String;


import java.util.HashSet;
import java.util.Set;

//C:\Users\levy0\Dropbox\Work\alg\pic\395 remove certain character
public class RearrangeSpacesBetweenWords {
    public String remove(String input, String t) {
        StringBuilder builder = new StringBuilder();

        Set<Character> set = new HashSet<>();

       for(int i = 0; i < t.length(); i ++){
           set.add(t.charAt(i));
       }

        for(int i = 0; i < input.length();i++){
            if(!set.contains(input.charAt(i))){
                builder.append(input.charAt(i));
            }
        }

        return  builder.toString();
    }
}
