package com.binarytree;

public class CheckLeafsAreSameLevel
{
    int leafHeight;

    boolean isLeafsAreSameLevel(Node root)
    {
        leafHeight = height(root);
        return checkLeftLeafHeight(root, 0);
    }

    private boolean checkLeftLeafHeight(Node root, int level)
    {
        if (root == null)
        {
            return true;
        }
        if (root.left == null && root.right == null)
        {
            if (level != leafHeight - 1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return checkLeftLeafHeight(root.left, level + 1) && checkLeftLeafHeight(root.right, level + 1);
    }


    private int height(Node root)
    {
        if (root == null)
            return 0;
        return 1 + height(root.left);
    }

}
