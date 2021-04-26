package com.binarytree;

public class CheckLeafsAreSameLevelTest
{

    /**
     * Solution Steps
     * 1 : find the left leaf node heoght
     * 2. compare all the leaf nodes height to match same.
     * @param args
     */
    public static void main(String[] args)
    {
    Node root = new Node(12);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(9);
        root.left.left.left = new Node(1);
        root.left.right.left = new Node(1);
        System.out.println(new CheckLeafsAreSameLevel().isLeafsAreSameLevel(root));
    }
}
