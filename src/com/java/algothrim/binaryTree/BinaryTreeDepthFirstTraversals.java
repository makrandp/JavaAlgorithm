package com.java.algothrim.binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeDepthFirstTraversals {

    /*
    (a) Inorder (Left, Root, Right)
    (b) Preorder (Root, Left, Right)
    (c) Postorder (Left, Right, Root)
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new LinkedList();

        inorderTraversalR(root, list);

        return list;

    }

    public void inorderTraversalR(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversalR(root.left, list);
        list.add(root.val);
        inorderTraversalR(root.right, list);
    }

}
