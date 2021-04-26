package com.binarytree;

public class CorrectTheBstTest
{
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(20);
        //new CorrectTheBST().correctBSTNodes(root);
        System.out.println(root);
    }
}
