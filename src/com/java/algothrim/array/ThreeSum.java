package com.java.algothrim.array;

import java.util.*;

//https://leetcode.com/problems/3sum/
public class ThreeSum {
    //Two Pointers
    /*
    For the main function:

        Sort the input array nums.
        Iterate through the array:
            If the current value is greater than zero, break from the loop. Remaining values cannot sum to zero.
            If the current value is the same as the one before, skip it.
            Otherwise, call twoSumII for the current position i.

    For twoSumII function:
        Set the low pointer lo to i + 1, and high pointer hi to the last index.
        While low pointer is smaller than high:
            If sum of nums[i] + nums[lo] + nums[hi] is less than zero, increment lo.
            If sum is greater than zero, decrement hi.
            Otherwise, we found a triplet:
                Add it to the result res.
                Decrement hi and increment lo.
                Increment lo while the next value is the same as before to avoid duplicates in the result.
     */
    public static List<List<Integer>> threeSumTwoPointer(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                twosum(i, nums, result);
            }
        }
        return result;
    }

    private static void twosum(int currentPosition, int[] nums, List<List<Integer>> result) {
        int lowIndex = currentPosition + 1;
        int highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            if (nums[currentPosition] + nums[lowIndex] + nums[highIndex] < 0) {
                lowIndex++;
            } else if (nums[currentPosition] + nums[lowIndex] + nums[highIndex] > 0) {
                highIndex--;
            } else {
                result.add(Arrays.asList(nums[currentPosition], nums[lowIndex], nums[highIndex]));
                int originalLowIndex = lowIndex;
                lowIndex++;
                while (lowIndex < highIndex && nums[originalLowIndex] == nums[lowIndex]) {
                    lowIndex ++;
                }
                highIndex--;
            }
        }
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        int firstIndex;
        int secondIndex;

        Map<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (firstIndex = 0; firstIndex < nums.length; firstIndex++) {
            for (secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
                int difference = -nums[firstIndex] - nums[secondIndex];
                if (map.containsKey(difference) && map.get(difference) != firstIndex &&
                        map.get(difference) != secondIndex && map.get(difference) > secondIndex) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[firstIndex]);
                    list.add(nums[secondIndex]);
                    list.add(difference);
                    Collections.sort(list);
                    result.add(list);
                }
            }
        }

        List<List<Integer>> list = new ArrayList();
        for (List<Integer> child : result) {
            list.add(child);
        }
        return list;
    }


}
