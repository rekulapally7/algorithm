package com.binarytree;

import java.util.*;

public class CheckValidBinaryTreeNodes
{

    boolean isValidBTreeNodes(List<Node> nodes)
    {

        Set<Node> childNodes = new HashSet<>();
        for (Node node : nodes)
        {
            if (node.left != null)
            {
                if (!childNodes.add(node.left))
                {
                    return false;
                }

            }
            if (node.right != null)
            {
                if (!childNodes.add(node.right))
                    return false;
            }
        }

        //finding the root node

        Node rootNode = null;
        for (Node node : nodes)
        {
            if (!childNodes.contains(node))
            {
                rootNode = node;
                break;
            }
        }

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);
        while (!nodeQueue.isEmpty())
        {
            Node node = nodeQueue.remove();
            nodes.remove(node);
            if (null != node.left)
            {
                System.out.println(node.left.val);
                nodeQueue.add(node.left);
            }
            if (null != node.right)
            {
                System.out.println(node.right.val);
                nodeQueue.add(node.right);
            }
        }

        if (nodes.isEmpty())
            return true;
        return false;
    }
}
