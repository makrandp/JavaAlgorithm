package com.java.algothrim.basicAlog;

import com.java.algothrim.binaryTree.TreeNode;

import java.util.LinkedList;
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



    void printLevelOrder(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty())
        {

            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/
            util/linkedlist_poll.htm */
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.val + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    // Prints level order traversal line
    // by line using queue.
    static void levelOrder(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();

        // Pushing root node into the queue.
        q.add(root);

        // Pushing delimiter into the queue.
        q.add(null);

        // Executing loop till queue becomes
        // empty
        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            // condition to check the
            // occurence of next level
            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            } else {
                // Pushing left child current node
                if (curr.left != null)
                    q.add(curr.left);

                // Pushing right child current node
                if (curr.right != null)
                    q.add(curr.right);

                System.out.print(curr.val + " ");
            }
        }
    }



}
