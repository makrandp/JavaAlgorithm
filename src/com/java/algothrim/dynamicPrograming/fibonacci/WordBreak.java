package com.java.algothrim.dynamicPrograming.fibonacci;

import java.util.List;

//https://leetcode.com/problems/word-break/
public class WordBreak {
    Boolean[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        memo = new Boolean[s.length()];
        return wordBreakR(s,0,wordDict);
    }

    private boolean wordBreakR(String s,int startIndex, List<String> wordDict) {
        if (startIndex >= s.length()) {
            return true;
        }

        if (memo[startIndex] != null) {
            return memo[startIndex];
        }

        for (int i = startIndex; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(startIndex, i)) && wordBreakR(s, i, wordDict)) {
                memo[startIndex] = true;
                return memo[startIndex];
            }
        }
        memo[startIndex] = false;
        return memo[startIndex];
    }
}
