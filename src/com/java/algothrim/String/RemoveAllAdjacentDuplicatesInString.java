package com.java.algothrim.String;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class RemoveAllAdjacentDuplicatesInString {

   //use StringBuilder as stack
   public String removeDuplicatesSolution1(String S){
       StringBuilder stringBuilder = new StringBuilder();
       int stringBuilderLength = 0;

       for (char c : S.toCharArray()) {
           if(stringBuilderLength != 0 && c == stringBuilder.charAt(stringBuilderLength - 1)){
               stringBuilder.deleteCharAt(stringBuilderLength - 1 );
               stringBuilderLength --;
           }else {
               stringBuilder.append(c);
               stringBuilderLength ++;
           }
       }
       return stringBuilder.toString();
   }

    //use stack
    public String removeDuplicatesSolution(String S){
        char[] charArray = S.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c: charArray) {
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(c == stack.peek()){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }

        char[] result = new char[stack.size()];
        for (int i = 0; i < stack.size(); i ++) {
            result[i] = stack.get(i);
        }
        return new String(result);

    }


    public String removeDuplicates(String S) {
        int index = getDuplicates(S);
        if (index == -1) {
            return S;
        }

        String result = removeDuplicate(S, index);
        return removeDuplicates(result);
    }

    private String removeDuplicate(String s, int index) {
        if (s.length() < index + 2) {
            return "null";
        }
        return s.substring(0, index) + s.substring(index + 2);
    }

    private int getDuplicates(String s) {
        char[] charArray = s.toCharArray();
        int[] result = new int[2];

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                return i;
            }
        }
        return -1;
    }


}
