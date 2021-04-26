package com.binarytree;

import java.util.ArrayList;
import java.util.List;

public class DistanceBetweenTwoNodes
{
    int distance(Node root, Node first, Node second)
    {
        List<Node> nodeList = new ArrayList<>();
        order(root, first, second, nodeList);
        return !nodeList.isEmpty() ? (nodeList.indexOf(second) - nodeList.indexOf(first)) : 0;
    }


    void order(Node root, Node first, Node second, List<Node> nodeList)
    {
        if (root == null)
            return;

        order(root.left, first, second, nodeList);
        nodeList.add(root);
        order(root.right, first, second, nodeList);
    }
}
