package com.java.algothrim.String;

import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length();i++){
            max = Math.max(max,longestSubstringInplace(s,i));
        }
        return max;
    }

    private int longestSubstringInplace(String s,int index){
        int[] acciiTable = new int[128];
        int count = 0;

        for(int i = index; i < s.length(); i ++){
            if(acciiTable[s.charAt(i)] == 0){
                acciiTable[s.charAt(i)]++;
                count ++;
            }else{
                break;
            }
        }

        return count;
    }
}
