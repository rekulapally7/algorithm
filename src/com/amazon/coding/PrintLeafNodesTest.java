package com.amazon.coding;

import com.binarytree.Node;

public class PrintLeafNodesTest
{
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);

        root.right.left=new Node(6);
        root.right.left.left=new Node(9);
        root.right.left.right=new Node(10);

        System.out.println(new PrintLeftNodes().lefNodes(root));


    }

}
