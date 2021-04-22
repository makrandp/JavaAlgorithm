package com.java.algothrim.array;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int n : nums){
            if (n <= smallest) {
                smallest = n;
            }else if (n <= second) {
                second = n;
            }else {
                return true;
            }
        }
        return false;
    }
}
