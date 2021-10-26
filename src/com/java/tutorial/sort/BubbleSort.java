package com.java.tutorial.sort;

import com.java.tutorial.util.Util;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int lastUnsortedIndex = array.length - 1; // it is array.length -1 not array.length as we always check the array[i+1]

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    Util.swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsortedIndex--;
        }
    }



}
