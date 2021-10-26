package com.java.algothrim.String;

import java.util.Stack;

//https://leetcode.com/problems/decode-string/submissions/
public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder word = new StringBuilder();

        String k = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                while (stack.peek() != '[') {
                    word.insert(0,stack.pop());
                }
                stack.pop();

                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = stack.pop() + k;
                }

                word.append(word.toString().repeat(Integer.parseInt(k) - 1));

                for (char character : word.toString().toCharArray()) {
                    stack.push(character);
                }
                word.setLength(0);
                k = "";
            } else {
                stack.push(c);

            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char character : stack) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }


    public String decodeString2Stack(String s){

        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int k = 0;
        StringBuilder currentString = new StringBuilder();

        for (char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k =  k * 10 + c - '0';
            }else if( c == '['){
                numberStack.push(k);
                stringStack.push(currentString);
                k = 0;
                currentString = new StringBuilder();
            }else if( c == ']'){
                StringBuilder decodeString = stringStack.pop();
                k = numberStack.pop();
                decodeString.append(currentString.toString().repeat(k));
                currentString = decodeString;
                k= 0;
            }else{
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

}
