package com.java.algothrim.binaryTree;

public class DiameterOfBinaryTree {


    //https://www.youtube.com/watch?v=ey7DYc9OANo
    int ans;


    public int height(TreeNode root) {
       MaximumDepthofBinaryTree tree = new MaximumDepthofBinaryTree();
       return tree.maxDepth(root);
    }

    public int diameterOfBinaryTree(TreeNode node) {
        if (node == null) return 0;
        int LHeight = height(node.left);
        int RHeight = height(node.right);
        int lDiameter = diameterOfBinaryTree(node.left);
        int RDiameter = diameterOfBinaryTree(node.right);
        return Math.max(LHeight + RHeight, Math.max(lDiameter,RDiameter));
    }
}
