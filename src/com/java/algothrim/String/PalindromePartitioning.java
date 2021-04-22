package com.java.algothrim.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/palindrome-partitioning/
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtracking(s,new ArrayList<>(),result);


        return result;
    }

    public void backtracking(String s, List<String> currentCombination,
                               List<List<String>> result) {
        if (s.length() == 1) {
            return;
        }

        for (int i = 1; i < s.length(); i++) {
            String first = s.substring(0 , i );
            String second = s.substring(i);

            currentCombination.add(first);
            backtracking(second,currentCombination,result);
            result.add(new ArrayList<>(currentCombination));
            currentCombination.remove(currentCombination.size() - 1 );
        }
    }

    private boolean isAllWordInListPalindrome(List<String> list) {
        for (String s :
                list) {
            if (!isPalindrome(s)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
