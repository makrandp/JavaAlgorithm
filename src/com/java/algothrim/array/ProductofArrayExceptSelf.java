package com.java.algothrim.array;

public class ProductofArrayExceptSelf {
    //https://leetcode.com/problems/product-of-array-except-self/submissions/
    public static int[] productExceptSelfBruteForce(int[] nums) {
        int[] resultArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int result = 1;

            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    result = nums[j] * result;
                }
            }
            System.out.println("result :" + result);

            resultArray[i] = result;
        }

        return resultArray;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i -1 ] * nums[i - 1];
        }

        right[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1 ] * nums[i + 1];
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }



        return result;

    }
}
