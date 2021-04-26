package com.amazon.coding;

import com.binarytree.Node;

import java.util.List;
import java.util.Map;

public class TreeLevelOrderTest
{
    public static void main(String[] args)
    {

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        Map<Integer, List<Integer>> integerListMap= new TreeLevelOrder().bfs(root);
        integerListMap.values();

    }
}
