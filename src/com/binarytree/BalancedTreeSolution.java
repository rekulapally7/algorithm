package com.binarytree;

public class BalancedTreeSolution
{

    public boolean isBalanced(Node root)
    {
        if (root == null)
            return false;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diff = Math.abs(leftHeight - rightHeight);
        if (diff == 0 || diff == 1)
            return true;
        return false;
    }

    public int height(Node node)
    {
        if (node == null)
        {
            return 0;
        }
        int left = 1 + height(node.left);
        int right = 1 + height(node.right);
        return Math.max(left, right);
    }


    public Node mirror(Node root)
    {
        if (root == null)
            return null;
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left=right;
        root.right=left;
        return root;
    }

}
