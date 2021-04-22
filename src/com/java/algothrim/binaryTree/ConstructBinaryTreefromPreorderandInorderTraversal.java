package com.java.algothrim.binaryTree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorderArray, int[] inorder) {
        List<Integer> preorder = new ArrayList<>();
        for (int n :
                preorderArray) {
            preorder.add(n);
        }
        return buildTreeR(preorder,inorder);
    }

    private TreeNode buildTreeR(List<Integer> preorder,int[] inorder){
        // if inorder == 0, the node should be null
        if( inorder.length == 0){
            return null;
        }

        //remove the value from preorder
        int val = preorder.get(0);
        preorder.remove(Integer.valueOf(val));
        TreeNode node = new TreeNode(val);


        // if inorder == 1, the node should be itself
        if(inorder.length == 1){
            return node;
        }

        int[] inorderleft = getInOrderLeft(val,inorder);
        int[] inorderRight = getInorderRight(val,inorder);

        node.left = buildTreeR(preorder,inorderleft);
        node.right = buildTreeR(preorder,inorderRight);

        return node;

    }

    private int[] getInOrderLeft(int val, int[] inorder){
        int[] left = new int[0];
        int index = contain(val,inorder);
        if(index != -1){
            left = Arrays.copyOfRange(inorder,0,index);
        }
        return left;
    }

    private int[] getInorderRight(int val, int[] inorder){
        int[] right = new int[0];
        int index = contain(val,inorder);
        if(index != -1){
            right = Arrays.copyOfRange(inorder,index + 1,inorder.length );
        }
        return right;
    }

    private int contain(int val, int[] array){
        for(int i = 0; i < array.length; i ++){
            if(array[i] == val){
                return i;
            }
        }
        return -1;
    }


}
