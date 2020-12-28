package com.java.algothrim.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
public class TwoStrings {

    public static String twoStrings(String s1, String s2) {

        Set<Character> s1Set = new HashSet<>();
        Set<Character> s2Set = new HashSet<>();

        for(char c : s1.toCharArray()){
            s1Set.add(c);
        }

        for(char c : s2.toCharArray()){
            s2Set.add(c);
        }

        for (char c: s1Set) {
            if(s2Set.contains(c)){
                return "YES";
            }
        }

        return "NO";

    }
}
