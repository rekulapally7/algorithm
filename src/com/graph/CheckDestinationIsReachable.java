package com.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CheckDestinationIsReachable
{

    public static void main(String[] args)
    {
        int n = 8;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4},{3,5},{6,7}};
        new CheckDestinationIsReachable().findPath(n, edges, 0, 5);
    }

    public void findPath(int n, int[][] edges, int startEdge, int endEdge)
    {

        List<Node> verticesList = new LinkedList<>();

        for (int i = 0; i < n; i++)
        {
            verticesList.add(new Node(i));
        }

        for (int[] edge : edges)
        {
            int a = edge[0];
            int b = edge[1];
            verticesList.get(a).addEdge(verticesList.get(b));
            verticesList.get(b).addEdge(verticesList.get(a));
        }
        List<Node> visitedList = new ArrayList<>();
        System.out.println(dfsSearch(verticesList.get(startEdge), new Node(endEdge), visitedList));
    }


    private boolean dfsSearch(Node starteEdge, Node endEdge, List<Node> visitedList)
    {
        boolean found = false;
        if (starteEdge.val == endEdge.val)
            return true;
        visitedList.add(starteEdge);
        if (starteEdge.neighbors != null && !starteEdge.neighbors.isEmpty())
        {
            for (Node edge : starteEdge.neighbors)
            {
                if (!visitedList.contains(edge))
                    if (dfsSearch(edge, endEdge, visitedList))
                    {
                        found = true;
                    }
            }
        }
        return found;
    }
}


