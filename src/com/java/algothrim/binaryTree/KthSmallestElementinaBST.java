package com.java.algothrim.binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElementinaBST {
    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        iterateThroughKthSmallest(root,result);

        Collections.sort(result);
        return result.get(k - 1 );
    }


    private static void iterateThroughKthSmallest(TreeNode root, List<Integer> result){

        if(root == null){
            return ;
        }

        iterateThroughKthSmallest(root.left,result);
        result.add(root.val);
        iterateThroughKthSmallest(root.right,result);

    }
}
