package com.java.tutorial.search;

public class binarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int find = 73;

        System.out.println("binary search recursive");
        System.out.println(binarySearchR(array, find));
        System.out.println("binary search iterative");
        System.out.println(binarySearchIterative(array, find));

    }

    // Recursive method
    public static boolean binarySearchR(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length);
    }

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;  // this can cause int overflow
        //int mid = left + (right - left / 2);

        if (array[mid] == x) {
            return true;
        } else if (array[mid] > x) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

    //iterative method
    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == x) {
                return true;
            } else if (array[mid] > x) {

                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
