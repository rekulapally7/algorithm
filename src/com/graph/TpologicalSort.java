package com.graph;

import java.util.*;

/**
 * Topological Sort for the Directed Graph.
 */
public class TpologicalSort
{

    public static void main(String[] args)
    {
        int n=6;
        int[][] edges={{5,2},{5,0},{4,0},{4,1},{2,3},{3,1}};
        new TpologicalSort().initialize(6,edges);
    }
    /**
     *
     */
    public void initialize(int n, int[][] edges)
    {
        List<com.graph.Node> verticesList = new LinkedList<>();
        Map<Integer, Integer> indegree = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            verticesList.add(new Node(i));
            indegree.put(i,0);
        }

        for (int[] edge : edges)
        {
            int a = edge[0];
            int b = edge[1];
            verticesList.get(a).addEdge(verticesList.get(b));
            indegree.put(b, indegree.getOrDefault(b, 0) + 1);
        }
        System.out.println(topologicalSortOrder(verticesList,indegree));
    }


    public List<Integer> topologicalSortOrder( List<com.graph.Node> verticesList, Map<Integer, Integer> indegree)
    {
        List<Integer> topologicalOrder=new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue((o1, o2) -> indegree.get(o1) - indegree.get(o2));
        indegree.keySet().forEach(edge -> priorityQueue.add(edge));
        while(!priorityQueue.isEmpty())
        {
            int edge=priorityQueue.remove();
            topologicalOrder.add(edge);
            if(indegree.get(edge)==0)
            {
                 Node node=verticesList.get(edge);
                 List<Node> neighbors= node.neighbors;
                 for (Node neighborNode: neighbors )
                 {
                     indegree.put(neighborNode.val, indegree.getOrDefault(neighborNode.val,0)-1);
                 }
            }
            indegree.remove(edge);
            priorityQueue.clear();
            indegree.keySet().forEach(edgeNode -> priorityQueue.add(edgeNode));
        }
        return topologicalOrder;
    }

}
