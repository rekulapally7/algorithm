package com.binarytree;

public class BinaryTreeSubTreeOfAnotherTreeTest
{
    public static void main(String[] args)
    {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.left.left.left = new Node(0);

        Node rootc = new Node(4);
        rootc.left = new Node(1);
        rootc.right = new Node(2);
        rootc.left.left = new Node(0);

        System.out.println(new BinaryTreeSubTreeOfAnotherTree().isSubtree(root, rootc));
    }
}
