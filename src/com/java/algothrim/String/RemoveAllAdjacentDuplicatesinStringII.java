package com.java.algothrim.String;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
public class RemoveAllAdjacentDuplicatesinStringII {
    public String removeDuplicatesStack(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        int stackCurrentIndex = 0;


        for(int i = 0; i < stringBuilder.length(); i ++ ){
            if(i == 0 || stringBuilder.charAt(i) != stringBuilder.charAt(i -1)){
                stack.push(1);
                stackCurrentIndex ++;
            }else{
                Integer count = stack.pop() + 1;
                stack.push(count);
                stackCurrentIndex ++;
                if(count == k){
                    stack.pop();
                    stringBuilder.delete(stackCurrentIndex - k, stackCurrentIndex);
                    i = i - k;
                    stackCurrentIndex -= k;
                }
            }
        }
        return stringBuilder.toString();
    }




    //bruteForce
    public String removeDuplicatesBF(String s, int k) {
        return removeDuplicatesBF(s,k,false);
    }

    public String removeDuplicatesBF(String s, int k,boolean isBaseCase){
        if(isBaseCase){
            return s;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int stringBuilderIndex = 0;
        int count = 1;
        isBaseCase = true;

        for (char c : s.toCharArray()) {
            if(stringBuilderIndex != 0 && stringBuilder.charAt(stringBuilderIndex - 1) == c) {
                count++;
                stringBuilder.append(c);
                stringBuilderIndex ++;
                if (count == k) {
                    for (int i = 0; i < k ; i++) {
                        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    }
                    count = 1;
                    stringBuilderIndex -= k;
                    isBaseCase = false;
                }
            }else{
                stringBuilder.append(c);
                stringBuilderIndex ++;
                count = 1;
            }

        }

        return removeDuplicatesBF(stringBuilder.toString(),k,isBaseCase);
    }


    // dont use this
    public String removeDuplicates(String s, int k) {
        int index = hasDuplicate(s,k);

        if(index == -1){
            return s;
        }


        String string = removeDuplicate(s,index,k);
        return removeDuplicates(string,k);

    }

    private int hasDuplicate(String s, int k){
        int index;
        for (char c: s.toCharArray()) {
            index = s.indexOf(generatePattern(c,k));
            if(index != -1){
                return index;
            }
        }
        return  -1;
    }

    private String generatePattern(char c, int k){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < k ; i ++){
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private String removeDuplicate(String s, int index,int k){
        return s.substring(0,index) + s.substring(index + k);
    }
}
