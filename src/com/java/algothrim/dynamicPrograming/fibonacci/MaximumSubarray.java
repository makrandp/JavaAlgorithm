package com.java.algothrim.dynamicPrograming.fibonacci;

//https://leetcode.com/problems/maximum-subarray/solution/
public class MaximumSubarray {

    //https://www.youtube.com/watch?v=86CQq3pKSUw
    public int maxSubArray(int[] nums) {
        int n = nums.length, maxSum = nums[0];
        for (int i = 1; i < n; ++i) {
            System.out.println("num: " + nums[i]);
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            maxSum = Math.max(nums[i], maxSum);
            System.out.println("maxSum " + maxSum);
        }
        return maxSum;
    }
}
