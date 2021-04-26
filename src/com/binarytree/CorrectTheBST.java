package com.binarytree;

import java.util.List;

public class CorrectTheBST
{

    Node addBST(Node root, Node element)
    {
        if (root == null)
            return element;

        if (root.val > element.val)
        {
            root.left = addBST(root.left, element);

        } else
        {
            root.right = addBST(root.right, element);
        }
        return root;
    }


    Node search(Node root, int val)
    {
        if (root == null || root.val == val)
            return root;

        return root.val > val ? search(root.left, val) : search(root.right, val);
    }

    void inOrderTree(Node root, List<Integer> integerList)
    {
        if (root == null)
            return;

        inOrderTree(root.left, integerList);
        integerList.add(root.val);
        inOrderTree(root.right, integerList);
    }


    /*void correctBSTNodes(Node root)
    {
        if (root == null)
            return;
        *//*Node leftNode = getLeftNode(root, root.val);*//*
        Node rightNode = getRightNode(root, root.val);
        Node temp= leftNode;
        leftNode=rightNode;
        rightNode=temp;
    }*/


   /* Node getLeftNode(Node root, int rootVal)
    {
        if (root == null)
            return root;

        if (root.val > rootVal)
        {
            return root;
        } else
        {
            Node leftNode= getLeftNode(root.left, rootVal);
        }
    }*/


   /* Node getRightNode(Node root, int rootVal)
    {
        if (root == null)
            return root;

        if (root.val < rootVal)
        {
            return root;
        } else
        {
            return getLeftNode(root.right, rootVal);
        }
    }*/


}
