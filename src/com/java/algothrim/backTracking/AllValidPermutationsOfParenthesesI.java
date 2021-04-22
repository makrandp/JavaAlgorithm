package com.java.algothrim.backTracking;


import java.util.*;

/*
Get all valid permutations of l pairs of (), m pairs of [] and n pairs of {}.

Assumptions

l, m, n > = 0
Examples

l = 1, m = 1, n = 0, all the valid permutations are ["()[]", "([])", "[()]", "[]()"]
 */
public class AllValidPermutationsOfParenthesesI {

    Map<Character, Character> map = Map.of(')','(', ']', '[','}' , '{' );
    char[] bracket = {'(', ')', '[', ']', '{', '}'};


    public List<String> validParentheses(int l, int m, int n) {
        int[] count = {l,l,m,m,n,n};
        List<String> result = new ArrayList<>();
        int num = (l + m + n) * 2;


        validParentheses(count,result,new StringBuilder(),new Stack<>(),num);
        return result;

    }

    private void validParentheses(int[] count, List<String> result,
                                  StringBuilder currentCombination, Stack<Character> stack, int size) {
        if(currentCombination.length() == size){
            result.add(currentCombination.toString());
        }

        for(int i = 0; i < count.length ; i ++){
            if(map.containsValue(bracket[i])){
                if(count[i]>0){
                    currentCombination.append(bracket[i]);
                    count[i] --;
                    stack.push(bracket[i]);
                    validParentheses(count,result,currentCombination,stack,size);
                    count[i]++;
                    currentCombination.deleteCharAt(currentCombination.length() -1);
                    stack.pop();
                }
            }

            if(map.containsKey(bracket[i])){
                if(count[i] > 0 && !stack.isEmpty() && stack.peek() == map.get(bracket[i])){
                    currentCombination.append(bracket[i]);
                    count[i]--;
                    stack.pop();
                    validParentheses(count,result,currentCombination,stack,size);
                    count[i]++;
                    currentCombination.deleteCharAt(currentCombination.length() -1);
                    stack.push(map.get(bracket[i]));
                }
            }
        }
    }
}
