package com.amazon.coding;

import com.binarytree.Node;

import java.util.ArrayList;
import java.util.List;

public class PrintLeftNodes
{

    void printLeftNode(Node root,List<Integer> leftNodes)
    {
        if(root==null)
            return;
        if(root.left!=null ||  root.right!=null)
        {
            leftNodes.add(root.val);
        }
        printLeftNode(root.left,leftNodes);
        printLeftNode(root.right,leftNodes);
    }

    List<Integer> lefNodes(Node root)
    {
        List<Integer> leftNodes =new ArrayList<>();
        printLeftNode(root,leftNodes);
        return leftNodes;
    }
}
