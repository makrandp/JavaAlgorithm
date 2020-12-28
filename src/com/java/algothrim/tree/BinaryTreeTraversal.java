package com.java.algothrim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeTraversal {

    public void DFSprintInorder(TreeNode node){
        if (node == null){
            return;
        }

        /* first recur on left child */
        DFSprintInorder(node.left);

        /* then print the data of node */
        System.out.print(node.val + " ");

        /* now recur on right child */
        DFSprintInorder(node.right);
    }

    public void DFSprintPreorder(TreeNode node){
        if (node == null)
            return;
        /* first print data of node */
        System.out.print(node.val + " ");

        /* then recur on left sutree */
        DFSprintPreorder(node.left);

        /* now recur on right subtree */
        DFSprintPreorder(node.right);
    }

    void DFSprintPostorder(TreeNode node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        DFSprintPostorder(node.left);

        // then recur on right subtree
        DFSprintPostorder(node.right);

        // now deal with the node
        System.out.print(node.val + " ");
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) return levels;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;
        while ( !queue.isEmpty() ) {
            // start the current level
            levels.add(new ArrayList<Integer>());

            // number of elements in the current level
            int level_length = queue.size();
            for(int i = 0; i < level_length; ++i) {
                TreeNode node = queue.remove();

                // fulfill the current level
                levels.get(level).add(node.val);

                // add child nodes of the current level
                // in the queue for the next level
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            // go to next level
            level++;
        }
        return levels;
    }



}
