package com.java.algothrim.String;


//https://hjweds.gitbooks.io/leetcode/content/string-replace.html
public class StringReplace {
    public String replace(String input, String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        StringBuilder stringBuilder = new StringBuilder(input);

        int sIndex = stringBuilder.indexOf(s);
        while(sIndex != -1){
            replaceWord(stringBuilder,s,t,sIndex);
            sIndex = stringBuilder.indexOf(s);
        }

        return stringBuilder.toString();
    }

    private StringBuilder replaceWord(StringBuilder input, String s,String t, int startIndex){
        input.delete(startIndex,startIndex + s.length());
        input.insert(startIndex,t);
        return input;
    }
}
