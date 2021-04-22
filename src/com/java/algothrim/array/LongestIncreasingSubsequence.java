package com.java.algothrim.array;

//https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }

        int count = 1;
        int max = 1;
        int current = nums[1];
        Integer prev = nums[0];

        for (int i = 1; i < nums.length; i ++){
            current = nums[i];
            if(prev == null || current > prev){
                count++;
                prev = current;
            }else{
                max = Math.max(count,max);
                count = 1;
                prev = null;
            }
        }

        return max;

    }

}
