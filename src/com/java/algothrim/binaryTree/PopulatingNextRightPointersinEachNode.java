package com.java.algothrim.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class PopulatingNextRightPointersinEachNode {
    public Node connect(Node root){
        if(root == null){
            return root;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node current = q.poll();

            if(current != null){
                current.next = q.peek();
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }else{
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }

        return root;
    }
}
