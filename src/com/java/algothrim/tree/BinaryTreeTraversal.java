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



}
