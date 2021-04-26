package com.binarytree;

public class BalancedTreeTest
{
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);


        //System.out.println(new BalancedTreeSolution().isBalanced(root));
        Node newRoot= new BalancedTreeSolution().mirror(root);
        System.out.println(newRoot.val);


/*
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        root.right.left.right = new Node(13);
        root.right.left.left = new Node(12);

        root.right.right.right = new Node(15);
        root.right.right.left = new Node(14);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.right = new Node(9);
        root.left.left.left = new Node(8);

        root.left.right.right = new Node(11);
        root.left.right.left = new Node(10);
*/


    }
}
