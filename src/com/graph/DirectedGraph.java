package com.graph;

import java.util.*;

public class DirectedGraph implements Graph
{

    GraphType graphType;

    private List<List<Integer>> adjacentList = null;
    private int size = 0;

    public DirectedGraph(GraphType graphType, int size)
    {

        this.graphType = graphType;
        adjacentList = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
        {
            adjacentList.add(new ArrayList<>());
        }
    }

    // A utility function to print the adjacency list
    // representation of graph
    static void printGraph(DirectedGraph directedGraph)
    {
        List<List<Integer>> adj = directedGraph.getAdjacentList();
        for (int i = 0; i < adj.size(); i++)
        {
            System.out.println("\nAdjacency list of vertex  " + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++)
            {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    /**
     * https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
     *
     * @param directedGraph
     * @param start         BFS will be implemented by using queue
     */
    public static void bfs(DirectedGraph directedGraph, int start)
    {
        boolean[] visited = new boolean[4];
        List<List<Integer>> adjacentList = directedGraph.getAdjacentList();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty())
        {
            int v = queue.remove();

            System.out.println("VISITED  ->  " + v);
            List<Integer> adjV = adjacentList.get(v);
            for (Integer adjIn : adjV)
            {
                if (!visited[v])
                {
                    queue.add(adjIn);
                }
            }
            visited[v] = true;
        }
    }

    /**
     * https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
     *
     * @param directedGraph
     * @param start         Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
     *                      Space Complexity: O(V).
     *                      Since, an extra visited array is needed of size V.
     */
    public static void dfs(DirectedGraph directedGraph, int start)
    {
        boolean[] visited = new boolean[5];
        List<List<Integer>> adjacentList = directedGraph.getAdjacentList();

        Stack<Integer> vertexStack = new Stack<>();
        vertexStack.push(start);
        while (!vertexStack.isEmpty())
        {
            Integer vertex = vertexStack.pop();
            if (!visited[vertex])
            {
                System.out.println(vertex);
                List<Integer> adjacentVertex = adjacentList.get(vertex);
                for (Integer vertexNodes : adjacentVertex)
                {
                    vertexStack.push(vertexNodes);
                }
                visited[vertex] = true;
            }

        }
    }


    public static void main(String[] args)
    {
        // Creating a graph with 5 vertices
        int V = 5;

        DirectedGraph directedGraph = new DirectedGraph(GraphType.DIRECTED, V);
        directedGraph.addEdge(0, 1);
        // Adding edges one by one
        directedGraph.addEdge(0, 2);
        directedGraph.addEdge(2, 0);
        directedGraph.addEdge(1, 2);
        directedGraph.addEdge(2, 3);
        directedGraph.addEdge(3, 4);
        directedGraph.addEdge(3, 3);
        //printGraph(directedGraph);

        dfs(directedGraph, 2);
    }

    @Override
    public void addEdge(int v1, int v2)
    {
        List<Integer> adjecentLS = adjacentList.get(v1);
        adjecentLS.add(v2);
        if (graphType.equals(GraphType.UNDIRECTED))
        {
            adjacentList.get(v2).add(v1);
        }
    }

    @Override
    public List<Integer> getAdjacentVertex(int v)
    {
        return adjacentList.get(v);
    }


    public List<List<Integer>> getAdjacentList()
    {
        return adjacentList;
    }

    public void setAdjacentList(List<List<Integer>> adjacentList)
    {
        this.adjacentList = adjacentList;
    }
}



