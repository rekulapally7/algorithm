package com.amazon.coding;

import com.binarytree.Node;

import java.util.ArrayList;
import java.util.List;

public class ChkBST
{
    public boolean isValidBST(Node root)
    {
        List<Integer> integerList = new ArrayList<>();
        preOrder(root, integerList);
        for (int i = 0; i < integerList.size(); i++)
        {
            if (integerList.get(i) >= integerList.get(i + 1))
                return false;
        }
        return true;
    }

    public void preOrder(Node root, List<Integer> integerList)
    {
        if (root == null)
            return;
        System.out.println();
        preOrder(root.left, integerList);
        integerList.add(root.val);
        preOrder(root.right, integerList);
    }
}
