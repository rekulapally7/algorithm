package com.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dfs
{
    static List<Node> visited=new LinkedList<>();
    public static void main(String[] args)
    {
        int n = 8;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}, {3, 5},{5,6}, {6, 7}};
        new Dfs().findPath(n, edges, 0, 5);
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
        Queue<Node> bfsQueue=new LinkedList<>();
        bfsQueue.add(verticesList.get(startEdge));
        visited.add(verticesList.get(startEdge));
        while (!bfsQueue.isEmpty())
        {
             Node node= bfsQueue.remove();

             if(node.val==endEdge)
             {
                 break;
             }
             List<Node> neighbors= node.neighbors;
             for (Node neighbor:neighbors)
             {
                 if(!visited.contains(neighbor))
                 {
                     visited.add(neighbor);
                     bfsQueue.add(neighbor);
                 }
             }
        }
        visited.forEach(node -> System.out.println(node.val));

        // dfs(verticesList.get(0));
    }

    private void dfs(Node node)
    {
          if(node==null|| visited.contains(node))
              return;
        System.out.println(node.val);
        visited.add(node);
        for (Node neighbors:node.neighbors)
        {
            dfs(neighbors);
        }
    }
}
