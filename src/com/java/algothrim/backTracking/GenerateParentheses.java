package com.java.algothrim.backTracking;

import java.util.*;

//https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {


    //brute force
    public static List<String> generateParenthesisBruteForce(int n) {
        Map<Character,Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        List<String> combination = new ArrayList<>();
        generateParenthesisBruteForce(new char[n * 2],0,combination,mappings);
        return combination;



    }

    private static void generateParenthesisBruteForce(char[] currentCombination,int i, List<String> result,Map<Character,Character> mappings){
        if(i == currentCombination.length){
            if(isValid(currentCombination,mappings)){
                result.add(new String(currentCombination));
            }
        }else{
            currentCombination[i] = '(';
            generateParenthesisBruteForce(currentCombination,i +1,result,mappings);
            currentCombination[i] = ')';
            generateParenthesisBruteForce(currentCombination,i +1,result,mappings);
        }
    }

    private static boolean isValid(char[] currentCombination,Map<Character,Character> mappings){
        Stack<Character> stack = new Stack<>();
        for (char c :
                currentCombination) {
            if (mappings.containsKey(c)){
                char top = stack.empty() ? '#' : stack.pop();

                if(top != mappings.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }


    public static List<String> generateParenthesisBackTracking(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesisBackTracking(list,0,0,new char[n * 2], 0);
        return list;
    }

    private static void generateParenthesisBackTracking(List<String> result,int open, int close, char[] currentCombination, int level){
        if(currentCombination.length == level){
            result.add(new String(currentCombination));
            return;
        }

        if(open < currentCombination.length / 2){
            currentCombination[level] = '(';
            generateParenthesisBackTracking(result,open + 1,close,currentCombination,level + 1);
        }

        if(close < open){
            currentCombination[level] = ')';
            generateParenthesisBackTracking(result,open ,close + 1,currentCombination,level + 1);
        }
    }

}
