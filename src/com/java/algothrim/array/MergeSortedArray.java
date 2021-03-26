package com.java.algothrim.array;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
