package com.java.algothrim.String;

import java.util.List;

//https://www.geeksforgeeks.org/remove-extra-spaces-string/
public class RemoveExtraSpaceFromAString {
    public String RemoveExtraSpace(String s){
        List<Character> punctuation = List.of(',','.','?');
        StringBuilder stringBuilder = new StringBuilder();
        int consecutive = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                consecutive ++;
            }else if(punctuation.contains(s.charAt(i))){
                for(int k = 0; k < consecutive; k ++){
                    stringBuilder.deleteCharAt(stringBuilder.length() -1);
                }
                consecutive = 0;
            } else{
                for(int k = 0; k < consecutive - 1; k ++){
                    stringBuilder.deleteCharAt(stringBuilder.length() -1);
                }
                consecutive = 0;
            }
            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString().trim();
    }
}
