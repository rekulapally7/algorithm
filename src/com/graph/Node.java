package com.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Node
{
    public int val;
    public List<Node> neighbors;
    public Node parent;

    public Node()
    {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val)
    {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors)
    {
        val = _val;
        neighbors = _neighbors;
    }

    public void addEdge(Node node)
    {
        neighbors.add(node);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (!(o instanceof Node))
            return false;
        Node node = (Node) o;
        return val == node.val;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(val);
    }
}
