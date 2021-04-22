package com.java.algothrim.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class InorderSuccessorinBST {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        if(p.right != null){
            getInOrderList(p,p);
        }else{
            getInOrderList(root,p);
        }


        for(int i = 0; i < list.size(); i ++){
            if(list.get(i) != null && list.get(i).equals(p) && i + 1 < list.size()){
                return list.get(i + 1);
            }
        }

        return null;
    }

    private void getInOrderList(TreeNode root,TreeNode target){

        if(root == null){
            return;
        }

        if(target.val < root.val){
            getInOrderList(root.left,target);
        }
        list.add(root);
        if(target.val >= root.val){
            getInOrderList(root.right,target);
        }
    }

    public TreeNode inorderSuccessorWhile(TreeNode root, TreeNode p) {

        TreeNode successor = null;

        while (root != null) {

            if (p.val >= root.val) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }

        return successor;
    }

}
