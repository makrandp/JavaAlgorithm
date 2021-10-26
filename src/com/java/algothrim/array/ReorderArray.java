package com.java.algothrim.array;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ReorderArray {

    public int[] reorder(int[] nums){
        int n = nums.length /2 ;

        for(int i = 0; i < nums.length ; i ++){
            int j = i;
            while (nums[i] >= 0){
                j = getDisiredIndex(j,n);
                swap(nums,i,j);
            }
        }

        for(int i = 0; i < nums.length; i ++){
            nums[i] = -nums[i];
        }

        return nums;
    }

    private int getDisiredIndex(int index, int n) {
        if (index < n) {
            return 2 * index;
        } else {
            return (index - n) * 2 + 1;
        }
    }

    private void swap(int[] array,int a, int b){
        int temp = -array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
