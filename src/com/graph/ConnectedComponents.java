package com.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ConnectedComponents
{

    public static void main(String[] args)
    {
        int n = 8;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4},{3,5},{6,7}};
        new ConnectedComponents().reachableOrnot(n, edges);
    }

    public void reachableOrnot(int n, int[][] edges)
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
        for(int i=0;i<n;i++)
        {
           if(!visiedEdges.isEmpty()&& !visiedEdges.contains(new Node(i)))
           {
               visiedEdges.forEach(s-> System.out.print(s.val));
               visiedEdges.clear();
               System.out.println();
           }
            Stack<Node> stack = new Stack<>();
            stack.push(verticesList.get(i));
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
        }
        visiedEdges.forEach(s-> System.out.print(s.val));
    }
}
