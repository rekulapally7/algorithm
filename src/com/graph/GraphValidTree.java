package com.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphValidTree
{

    public static void main(String[] args)
    {
        int n = 4;
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}};
        System.out.println(new GraphValidTree().validTree(n, edges));
        //System.out.println(validTree(n, edges));
    }

    public boolean validTree(int n, int[][] edges)
    {

        if (edges.length == 0)
        {
            return true;
        }
        List<Node> verticesList = new LinkedList<>();

        for (int i = 0; i < n; i++)
        {
            verticesList.add(new Node(i));
        }

        for (int[] edge : edges)
        {
            int a = edge[0];
            int b = edge[1];
            verticesList.get(a).addEdge(verticesList.get(b) );
            verticesList.get(b).addEdge(verticesList.get(a));
        }
        List<Node> visiedEdges = new ArrayList<>();
        Queue<Node> bfsqueue = new LinkedList<>();

        bfsqueue.add(verticesList.get(0));
        boolean foundCycle = false;
        while (!bfsqueue.isEmpty())
        {
            Node edge = bfsqueue.remove();
            if (!visiedEdges.contains(edge))
            {
                List<Node> neighborsList = edge.neighbors;
                for (Node tempEdge : neighborsList)
                {
                    if (edge.parent == null || edge.parent.val != tempEdge.val)
                    {
                        tempEdge.parent = edge;
                        bfsqueue.add(tempEdge);
                    }
                }
                visiedEdges.add(edge);
            } else
            {
                foundCycle = true;
                break;
            }
        }
        if (visiedEdges.size() != n)
            return false;
        return !foundCycle;
    }



}
