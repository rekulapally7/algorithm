package com.graph;

import java.util.LinkedList;
import java.util.Queue;

class QNode
{
    int col;
    int row;
    int distance;

    public QNode(int row, int col, int distance)
    {
        this.col = col;
        this.row = row;
        this.distance = distance;
    }
}

public class ShortestPathInaGraphMatrix
{

    public static int minDistance(int m[][])
    {
        boolean[][] visited = new boolean[m.length][m[0].length];//default value will be false for all values.
        int i = 0, j = 0;
        int rowlength = m.length;
        int columnLength = m[0].length;
        QNode qNode = new QNode(i, j, 1);
        Queue<QNode> qNodes = new LinkedList<>();
        qNodes.add(qNode);
        visited[i][j] = true;
        while (!qNodes.isEmpty())
        {
            QNode currentNode = qNodes.remove();
            if (m[currentNode.row][currentNode.col] == -1)
                return currentNode.distance;

            if (currentNode.row - 1 >= 0 && currentNode.row - 1 < rowlength && m[currentNode.row - 1][currentNode.col] != 1 && !visited[currentNode.row - 1][currentNode.col])
            {
                visited[currentNode.row - 1][currentNode.col] = true;
                qNodes.add(new QNode(currentNode.row - 1, currentNode.col, currentNode.distance + 1));
            }

            if (currentNode.row + 1 >= 0 && currentNode.row + 1 < rowlength && m[currentNode.row + 1][currentNode.col] != 1 && !visited[currentNode.row + 1][currentNode.col])
            {
                visited[currentNode.row + 1][currentNode.col] = true;
                qNodes.add(new QNode(currentNode.row + 1, currentNode.col, currentNode.distance + 1));
            }

            if (currentNode.col - 1 >= 0 && currentNode.col - 1 < columnLength && m[currentNode.row][currentNode.col - 1] != 1 && !visited[currentNode.row][currentNode.col - 1])
            {
                visited[currentNode.row ][currentNode.col-1] = true;
                qNodes.add(new QNode(currentNode.row, currentNode.col - 1, currentNode.distance + 1));
            }

            if (currentNode.col + 1 >= 0 && currentNode.col + 1 < columnLength && m[currentNode.row][currentNode.col + 1] != 1 && !visited[currentNode.row][currentNode.col + 1])
            {
                visited[currentNode.row ][currentNode.col+1] = true;
                qNodes.add(new QNode(currentNode.row, currentNode.col + 1, currentNode.distance + 1));
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[][] m={{0,1,1,1},{0,0,0,1},{1,1,0,1},{1,1,-1,1} };
        System.out.println(minDistance(m));
    }
}
