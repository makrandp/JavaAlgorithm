package com.java.algothrim.array;

//https://leetcode.com/problems/move-zeroes/solution/
public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }
    }

    public static void moveZeroes1(int[] nums) {
        int anchor = 0;
        int explorer = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[anchor] != 0){
                anchor ++;
                explorer ++;
            }else{
                if (nums[explorer]!= 0){
                    nums[anchor] = nums[explorer];
                    nums[explorer] = 0;
                    explorer++;
                    anchor++;
                }else {
                    explorer++;
                }

            }
        }
    }
}
