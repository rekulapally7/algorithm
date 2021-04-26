package com.binarytree;

public class DistanceBetweenTwoNodesTest
{
    public static void main(String[] args)
    {

        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.left.left.left = new Node(0);
        System.out.println(new DistanceBetweenTwoNodes().distance(root, root.left.left.left,root.left.right ));
    }
}
