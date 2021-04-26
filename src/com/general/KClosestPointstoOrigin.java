package com.general;

import java.util.PriorityQueue;

public class KClosestPointstoOrigin
{
    public int[][] kClosest(int[][] points, int k)
    {
        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((a, b) ->

            a[0] * a[0] + a[1] * a[1] - b[0] * b[0] + b[1] * b[1]

        );
        for (int[] pont: points )
        {
            priorityQueue.add(pont);
        }

        int[][] result=new int[k][2];
        while (k-->0)
        {
            result[k] = priorityQueue.remove();
        }
        return result;
    }


    public static void main(String[] args)
    {
        System.out.println("hello");
    }
}
