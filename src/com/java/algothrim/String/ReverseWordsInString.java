package com.java.algothrim.String;


//https://leetcode.com/problems/reverse-words-in-a-string/submissions/
public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = words.length - 1 ; i >= 0 ; i --){
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }
}
