package com.java.algothrim.array;

import java.util.Arrays;

public class ReverseString {
//    public static void reverseString(char[] s) {
//        for(int i = 0; i < s.length /2 ; i ++){
//            char tempFront = s[i];
//            char tempBack = s[s.length -1 -i];
//
//            s[i] = tempBack;
//            s[s.length - 1 - i] = tempFront;
//        }
//
//        System.out.println( Arrays.toString(s));
//    }

    public static void helper(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        helper(s, left, right);
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
}
