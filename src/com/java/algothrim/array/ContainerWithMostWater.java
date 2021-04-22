package com.java.algothrim.array;

//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int lowIndex = 0;
        int highIndex = height.length - 1;

        int maxArea = Math.min(height[lowIndex],height[highIndex]) * (highIndex - lowIndex);

        while (lowIndex < highIndex){
            if(height[lowIndex] < height[highIndex]){
                lowIndex ++;
            }else{
                highIndex --;
            }

            maxArea = Math.max(maxArea, Math.min(height[lowIndex],height[highIndex]) * (highIndex - lowIndex));
        }

        return maxArea;
    }
}
