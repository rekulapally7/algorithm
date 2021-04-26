package com.binarytree;

public class BinaryTreeSubTreeOfAnotherTree
{
    boolean isSubtree = false;

    public boolean isSubtree(Node s, Node t)
    {
        if (s == null || t == null)
            return false;
        boolean result = true;
        if (!checkIsSubTree(s, t))
        {
            result =isSubtree(s.left,t)||isSubtree(s.right,t);
        }
        return result;
    }


    boolean checkIsSubTree(Node s, Node t)
    {
        if (s == null && t == null)
            return true;

        if (s == null || t == null)
            return false;
        return (s.val == t.val) && checkIsSubTree(s.left, t.left) && checkIsSubTree(s.right, t.right);
    }
}
