package com.amazon.coding;

import com.binarytree.Node;

import java.util.List;

public class VerticalOrderTest
{
    public static void main(String[] args)
    {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        List<List<Integer>> lists=new VerticalOrder().verticalOrder(root);
        lists.forEach(s-> System.out.println(s));
    }
}
