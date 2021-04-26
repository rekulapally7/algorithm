package com.binarytree;

public class LowestAncestor
{
    public Node lowestCommonAncestor(Node root, Node p, Node q)
    {
        if (root == null || p == null || q == null)
            return null;
        if (root.val == p.val || root.val == q.val)
            return root;

        System.out.println("ROOT   "+root.val);
        Node left = lowestCommonAncestor(root.left, p, q);

        if(left!=null)
        System.out.println("LEFT     "+left.val);

        Node right = lowestCommonAncestor(root.right, p, q);

        if(right!=null)
        System.out.println("RIGHT    "+right.val);

        if (left != null && right != null)
            return root;

        if (left != null)
            return left;
        else if (right != null)
            return right;

        return null;
    }
}
