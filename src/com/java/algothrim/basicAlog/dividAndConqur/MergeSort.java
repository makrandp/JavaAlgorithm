package com.java.algothrim.basicAlog.dividAndConqur;

public class MergeSort {
    private static void mergeSort(int[] original){
        if(original.length < 2){
            return ;
        }

        int length = original.length;
        int mid = length/2;
        int firstHalfLength = mid;
        int secondHalfLength = length - mid;

        int[] firstHalf = new int[firstHalfLength];
        int[] secondHalf = new int[secondHalfLength];

        for(int i = 0; i < firstHalfLength; i ++){
            firstHalf[i] = original[i];
        }

        for(int i = 0; i < secondHalfLength; i ++){
            secondHalf[i] = original[firstHalfLength + i];
        }

        mergeSort(firstHalf);
        mergeSort(secondHalf);
        merge(firstHalf,secondHalf,original);


    }



    private static void merge (int[] firstHalf , int[] secondHalf, int[] original){
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;
        int originalIndex = 0;
        int length = original.length;

        while( firstHalfIndex < firstHalf.length && secondHalfIndex <  secondHalf.length){
            if(firstHalf[firstHalfIndex] > secondHalf[secondHalfIndex]){
                original[originalIndex] = secondHalf[secondHalfIndex];
                originalIndex ++;
                secondHalfIndex++;
            }else {
                original[originalIndex] = firstHalf[firstHalfIndex];
                firstHalfIndex ++;
                originalIndex ++;
            }
        }

        while (firstHalfIndex< firstHalf.length){
            original[originalIndex] = firstHalf[firstHalfIndex];
            firstHalfIndex ++;
            originalIndex ++;
        }

        while(secondHalfIndex< secondHalf.length){
            original[originalIndex] = secondHalf[secondHalfIndex];
            originalIndex ++;
            secondHalfIndex++;
        }

    }
}
