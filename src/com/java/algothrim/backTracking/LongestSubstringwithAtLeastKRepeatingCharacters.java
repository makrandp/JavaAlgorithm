package com.java.algothrim.backTracking;

import java.util.*;

public class LongestSubstringwithAtLeastKRepeatingCharacters {
    Map<Character,Integer> map = new HashMap<>();

    public int longestSubstring(String s, int k) {
        if(isStringMeetRequirement(s,k)){
            return s.length();
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) < k) {
                return Math.max(
                        longestSubstring(s.substring(0, i), k),
                        longestSubstring(s.substring(i + 1), k));
            }
        }

        return 0;

    }

    private int contains(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    private boolean isStringMeetRequirement(String s, int k) {
        map.clear();
        for (int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i), 0) + 1;
            map.put(s.charAt(i), count);
        }

        for (Integer i : map.values()) {
            if (i < k) {
                return false;
            }
        }
        return true;
    }
}
