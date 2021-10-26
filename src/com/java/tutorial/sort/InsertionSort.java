package com.java.tutorial.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {37, 23, 0, 17, 12, 72, 31, 46, 100, 88, 54};

        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int[] arr) {
        int lastSorted = 1;
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int insertIndex = binarySearch(arr, current, 0, lastSorted);

        //  System.arraycopy(sourceArray, sourcePosition, destinationArray, desPosition,length)
            System.arraycopy(arr, insertIndex, arr, insertIndex + 1, lastSorted - insertIndex);

            arr[insertIndex] = current;
            lastSorted++;
        }
    }


    public static int binarySearch(int[] arr, int item, int low, int high) {
        if (low >= high) {
            return low;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == item) {
            return mid + 1;
        } else if (arr[mid] > item) {
            return binarySearch(arr, item, low, mid);
        } else {
            return binarySearch(arr, item, mid + 1, high);
        }

    }
}
