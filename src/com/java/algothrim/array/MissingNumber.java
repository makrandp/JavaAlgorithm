package com.java.algothrim.array;

import java.lang.reflect.Array;
import java.util.*;

//https://leetcode.com/problems/missing-number/
//
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int i : nums)
        {
            numSet.add(i);
        }
        for ( int i = 0; i <= nums.length; i++){
            if(!numSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
