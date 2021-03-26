package com.java.algothrim.array;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        boolean isCarry = false;

        int lastDigits = digits[digits.length- 1];

        if(lastDigits == 9){
            digits[digits.length-1] = 0;
            isCarry = true;
        }else{
            digits[digits.length-1] = digits[digits.length-1] + 1;
        }

        for(int i = digits.length - 2 ; i >= 0; i --){
            if(isCarry){
                if(digits[i] == 9 ){
                    digits[i] = 0;
                }else {
                    digits[i]++;
                    isCarry = false;
                }
            }
        }

        if(isCarry){
            int[] result = new int[digits.length + 1];
            for(int i = digits.length - 1 ; i >= 0; i --){
                result[i + 1] = digits[i];
            }
            result[0] = 1;
            return result;
        }
        return digits;
    }

    public static int[] plusOne1(int[] digits) {
        for(int i = digits.length -1; i >= 0; i --){
            if(digits[i] < 9){
                digits[i] ++;
                return  digits;
            }
            // if last one is 9
            digits[i] = 0;
        }

        // if array is 9999
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return  result;
    }

}
