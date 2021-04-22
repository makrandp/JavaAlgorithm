package com.java.algothrim.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/4sum-ii/
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);

    }

    private List<List<Integer>> kSum(int[] nums, int currentPosition, int target, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (currentPosition == nums.length || nums[currentPosition] * k > target ||
                nums[nums.length - 1] * k < target) {
            return result;
        }
        if (k == 2) {
            return twoSum(currentPosition , nums, target);
        }
        for (int i = currentPosition; i < nums.length; i++) {
            //if i = currentPosition, there is no previous to check
            if (i == currentPosition || nums[i - 1] != nums[i]) {
                for (List<Integer> list : kSum(nums, i + 1, target - nums[i], k - 1)) {
                    list.add(nums[i]);
                    result.add(list);
//                    result.add(new ArrayList<>(Arrays.asList(nums[i])));
//                    result.get(result.size() - 1).addAll(list);
                }
            }
        }
        return result;

    }


    private List<List<Integer>> twoSum(int currentPosition, int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int lowIndex = currentPosition ;
        int highIndex = nums.length - 1;
        while (lowIndex < highIndex) {
            if (nums[lowIndex] + nums[highIndex] < target) {
                lowIndex++;
            } else if (nums[lowIndex] + nums[highIndex] > target) {
                highIndex--;
            } else {
                result.add(new ArrayList<>(Arrays.asList(nums[highIndex], nums[lowIndex])));
                highIndex--;
                lowIndex++;
                while (lowIndex < highIndex && nums[lowIndex] == nums[lowIndex - 1]) {
                    lowIndex++;
                }
            }
        }
        return result;
    }

}
