package com.java.algothrim.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int nums1Index = 0, nums2Index = 0;


        while (nums1Index < nums1.length && nums2Index < nums2.length) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums2Index++;
            } else if (nums1[nums1Index] < nums2[nums2Index]) {
                nums1Index++;
            } else {
                list.add(nums1[nums1Index]);
                nums1Index++;
                nums2Index++;
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
