package com.graph;

import java.util.*;

/**
 * Minimum Spanning tree
 */
public class MinimumSpanningTree
{
    public static void main(String[] args)
    {
        int n = 8;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4},{3,5},{6,7}};
        new MinimumSpanningTree().printMinimumSpaningTree(n, edges);
    }

    public void printMinimumSpaningTree(int n, int[][] edges)
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
        List<Node> visiedEdges = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        stack.push(verticesList.get(0));

        while (!stack.isEmpty())
        {
            Node edge = stack.pop();
            if (!visiedEdges.contains(edge))
            {
                visiedEdges.add(edge);
                List<Node> neighborsList = edge.neighbors;
                for (Node tempEdge : neighborsList)
                {
                    if (edge.parent == null || edge.parent.val != tempEdge.val)
                    {
                        tempEdge.parent = edge;
                        stack.push(tempEdge);
                    }
                }

            }
        }
        System.out.println("*******************************VISITED EDGES***********************");
        for (Node node : visiedEdges)
        {
            System.out.println(node.val);
        }
    }
}




