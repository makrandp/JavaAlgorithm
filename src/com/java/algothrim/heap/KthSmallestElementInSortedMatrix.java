package com.java.algothrim.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
public class KthSmallestElementInSortedMatrix {

    //merge sort
    public static int kthSmallest(int[][] matrix, int k) {
        int count = 0;
        int[] sort = matrix[0];

        for(int i = 1; i < matrix.length;i++){
            sort = merge(sort,matrix[i]);
        }

        return sort[k - 1];

    }

    private static int[] merge(int[] left, int[]right){
        int leftIndex = 0;
        int rightIndex = 0;
        int sortIndex = 0;
        int[] sorted = new int[left.length + right.length];

        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex]){
                sorted[sortIndex] = left[leftIndex];
                sortIndex++;
                leftIndex++;
            }else{
                sorted[sortIndex] = right[rightIndex];
                sortIndex++;
                rightIndex++;
            }
        }

        while(leftIndex < left.length){
            sorted[sortIndex] = left[leftIndex];
            sortIndex++;
            leftIndex++;
        }

        while(rightIndex < right.length){
            sorted[sortIndex] = right[rightIndex];
            sortIndex++;
            rightIndex++;
        }

        return sorted;
    }





    // heap
    public static int kthSmallestHeap(int[][] matrix, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);

        for (int[] array: matrix) {
            for (int i: array) {
                queue.add(i);
            }
        }

        int result = 0;
        for(int i = 0; i < k ; i ++){
            result = queue.poll();
        }
        return result;
    }

}

class Node {
    int value;
    int x;
    int y;

    Node(int value,int x, int y){
        this.value = value;
        this.x = x;
        this.y = y;
    }
}

class NodeComparator implements Comparator<Node>{
    @Override public int compare(Node o1, Node o2) {
        return o1.value- o2.value;
    }
}