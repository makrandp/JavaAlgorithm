package com.java.algothrim.array;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/solution/
public class TwoSum {

    //https://www.youtube.com/watch?v=U8B984M1VcU&feature=youtu.be
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
