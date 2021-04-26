package com.general;

import com.heap.Heap;

import java.util.PriorityQueue;

public class FindKthLargestElement
{

    static int findKLargestElement(int[] input,int k)
    {
        PriorityQueue<Integer> integerPriorityQueue=new PriorityQueue<>((o1, o2) -> o2-o1 );
        for (int a :input)
        {
            integerPriorityQueue.add(a);
        }

        int result=0;
        while( k-->0 )
        {
            result=integerPriorityQueue.remove();
        }

        return result;
    }


    public static void main(String[] args)
    {
        System.out.println(findKLargestElement(new int[] {3,2,1,5,6,4},2));

    }


}
