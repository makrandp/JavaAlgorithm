package com.java.algothrim.array;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class JumpingOnClouds {

    public static int jumpingOnClouds(int[] c) {
        int stepCount = 0;
        for (int i = 0 ; i < c.length; i++) {
            if(!isSave(c[i])){
                stepCount++;
            }
            else if(canJumpTwoStep(c,i)){
                stepCount ++;
                i++;
            }else if(canJumpOneStep(c,i)){
                stepCount ++;
            }
        }
        return stepCount;

    }

    private static boolean isSave(int i){
        return i == 0;
    }

    private static boolean hasNextStep(int[] c, int index){
        return index <= c.length - 2;
    }

    private static boolean hasNextTwoStep(int[] c, int index){
        return index <= c.length - 3;
    }

    private static boolean canJumpOneStep(int[] c, int index){
        return (hasNextStep(c,index) && isSave(c[index + 1]));
    }

    private static boolean canJumpTwoStep(int[] c, int index){
        return canJumpOneStep(c,index) && (hasNextTwoStep(c,index) && isSave(c[index + 2]));
    }

}
