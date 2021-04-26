package com.binarytree;

import java.util.ArrayList;
import java.util.List;

public class CheckValidBSolution
{
    public static void main(String[] args)
    {
        Node root = new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.right.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.left.right.left=root.left.left;

        List<Node> nodeList=new ArrayList<>();
        nodeList.add(root.left.left);
        nodeList.add(root.left.right);
        nodeList.add(root.right.right);
        nodeList.add(root.left.right.left);
        nodeList.add(root.left);
        nodeList.add(root.right);
        nodeList.add(root);
        System.out.println(new CheckValidBinaryTreeNodes().isValidBTreeNodes(nodeList));

    }
}
