package com.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree
{

    public static boolean leafSimilar(Node root1, Node root2)
    {
        if (root1 == null || root2 == null)
            return false;
        List<Integer> getFirstTreeLeafSeq = getLeafSeq(root1, new ArrayList<Integer>());
        List<Integer> getSecondTreeLeafSeq = getLeafSeq(root2, new ArrayList<Integer>());
        return getFirstTreeLeafSeq.equals(getSecondTreeLeafSeq) ? true : false;

    }

    static List<Integer> getLeafSeq(Node root, List<Integer> leafSeq)
    {
        if (root == null)
            return leafSeq;

        if (root.left == null && root.right == null)
        {
            leafSeq.add(root.val);
        }
        getLeafSeq(root.left, leafSeq);
        getLeafSeq(root.right, leafSeq);
        return leafSeq;
    }


    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        System.out.println(leafSimilar(root, root1));
    }
}
