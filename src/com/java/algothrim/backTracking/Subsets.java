package com.java.algothrim.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/subsets/
public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        //create a count array, each number only have one appearance
        int[] count = new int[nums.length];
        Arrays.fill(count, 1);

        // this add the nums array itself to the result
        List<Integer> itself = new ArrayList<>();

        for (int i :
                nums) {
            itself.add(i);
        }
        result.add(itself);


        subsets(nums, count, result, 0, new ArrayList<>());
        return result;
    }

    private static void subsets(int[] nums, int[] count, List<List<Integer>> result, int level,
                                List<Integer> currentCombination) {

        if (level < nums.length) {
            List<Integer> sorted = new ArrayList<>(List.copyOf(currentCombination));
            Collections.sort(sorted);
            if (!result.contains(sorted)) {
                result.add(sorted);
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (count[i] != 0) {
                count[i]--;
                currentCombination.add(nums[i]);
                subsets(nums, count, result, level + 1, currentCombination);
                currentCombination.remove(currentCombination.size() - 1);
                count[i]++;
            }
        }

    }


    /// https://www.youtube.com/watch?v=VdnvmfzA1pw
    public static List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> currentCombination = new ArrayList<>();

        subset1(nums, result, currentCombination, 0);

        return result;

    }

    private static void subset1(int[] nums, List<List<Integer>> result,
                                List<Integer> currentCombination, int startIndex) {
        result.add(new ArrayList<>(currentCombination));


        for(int i = startIndex; i < nums.length; i ++){
            currentCombination.add(nums[i]);
            subset1(nums,result,currentCombination,i + 1);
            currentCombination.remove(currentCombination.size() -1);
        }
    }

}
