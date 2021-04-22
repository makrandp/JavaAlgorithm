package com.java.algothrim.objectDesign;

import java.util.Arrays;
import java.util.Random;

//https://leetcode.com/problems/shuffle-an-array/
public class ShuffleAnArray {
    int[] original;
    int[] shuffle;

    public ShuffleAnArray(int[] nums) {
        original = nums;
        shuffle = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return  original.clone();
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        for(int i = 0; i < shuffle.length; i ++){
            int shuffleIndex = random.nextInt(shuffle.length);
            int temp =  shuffle[shuffleIndex];
            shuffle[shuffleIndex] = shuffle[i];
            shuffle[i] = temp;
        }
        return shuffle;
    }
}
