package com.java.algothrim.binaryTree;

import com.sun.source.tree.Tree;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
public class LowestCommonAncestorBinaryTree {
    TreeNode ancestor;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isInSameTree(root,p,q);
        return ancestor;
    }

    private Boolean isInSameTree(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return false;
        }

        int left = isInSameTree(root.left,p,q) ? 1: 0;
        int right = isInSameTree(root.right,p,q) ? 1:0;
        int current =  root == p || root == q ? 1 : 0;

        if(left + right + current >= 2 ){
            this.ancestor = root;
        }

        return  left+ right + current > 0;
    }
}
