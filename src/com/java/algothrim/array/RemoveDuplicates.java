package com.java.algothrim.array;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums != null && nums.length != 0){
            int current = nums[0];
            int index = 0;
            for (int i = 1; i< nums.length ; i ++){
                if(nums[i] != current){
                    index ++;
                    current = nums[i];
                    nums[index] = current;
                }
            }
            return index + 1;
        }
        return 0;

    }
}
