package com.java.algothrim.backTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
public class LetterCombinationsPhoneNumber {
    final Map<String,String[]> map = Map.of(
            "2",new String[]{"a","b","c"},
            "3",new String[]{"d","e","f"},
            "4",new String[]{"g","h","i"},
            "5",new String[]{"j","k","l"},
            "6",new String[]{"m","n","o"},
            "7",new String[]{"p","q","r","s"},
            "8",new String[]{"t","u","v"},
            "9",new String[]{"w","x","y","z"}
    );

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        backTracing("",0,digits,result);
        return result;
    }

    private void backTracing(String currentCombination,int level, String digits,List<String> result){
        if(level == digits.length()){
            result.add(currentCombination);
            return;
        }

//        System.out.println("level = " + level);
//        System.out.println("digits = " + level);

        char currentDigitChar = digits.charAt(level);
        String currentDigitString = String.valueOf(currentDigitChar);
        String[] currentDigitsString = map.get(currentDigitString);
        for(int i = 0; i < currentDigitsString.length;i++){
            String s = currentDigitsString[i];
            backTracing(currentCombination+s,level + 1,digits,result);
        }
    }
}
