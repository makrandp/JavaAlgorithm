package com.java.algothrim.dynamicPrograming.fibonacci;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HouseRobber {
    private int[] memo = new int[100];

    public int rob(int[] nums) {
        Arrays.fill(memo,-1);
        return rob(nums,0);
    }

    private int rob(int[] num,int currentIndex){
        if (currentIndex >= num.length){
            return 0;
        }

        if(memo[currentIndex] > 0){
            return memo[currentIndex];
        }

        int ans = Math.max(rob(num,currentIndex + 1),rob(num,currentIndex + 2) + num[currentIndex]);

        memo[currentIndex] = ans;
        return ans;

    }

}
