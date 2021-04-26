package com.binarytree;

import java.util.ArrayList;
import java.util.List;


public class FindRootOfNAryTree
{
    class Node
    {
        public int val;
        public List<com.binarytree.Node> children;

        public Node()
        {
            children = new ArrayList<com.binarytree.Node>();
        }

        public Node(int _val)
        {
            val = _val;
            children = new ArrayList<com.binarytree.Node>();
        }

        public Node(int _val, ArrayList<com.binarytree.Node> _children)
        {
            val = _val;
            children = _children;
        }
    }

    public Node findRoot(List<Node> tree)
    {
       if(tree==null || tree.isEmpty())
           return null;
       for (Node node: tree)
       {
          List<com.binarytree.Node>  childs= node.children;


       }

       return null;
    }


}
