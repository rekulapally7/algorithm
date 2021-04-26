package com.general;

import java.util.LinkedList;
import java.util.Queue;

public class SortTwoLists
{

    public static void main(String[] args)
    {
        int a[] = {1, 3};
        int b[] = {2, 0,0,0,0,0,0,0};

        //edge cases
        Queue<Integer> firstQueue = new LinkedList<>();
        Queue<Integer> secondQueue = new LinkedList<>();
        for (int temp : a)
        {
            firstQueue.add(temp);
        }

        for (int temp : b)
        {
            secondQueue.add(temp);
        }

        int[] finalMergeArray = new int[10];
        int i = 0;
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty())
        {
            int firstArrayValue = firstQueue.peek();
            int secondArrayValue = secondQueue.peek();
            if(firstArrayValue>=secondArrayValue)
            {
                finalMergeArray[i++]=firstArrayValue;
                firstQueue.remove();
            }
            else
            {
                finalMergeArray[i++]=secondArrayValue;
                secondQueue.remove();
            }
        }
        while (!firstQueue.isEmpty())
        {
            finalMergeArray[i++]=  firstQueue.remove();;
        }

        while (!secondQueue.isEmpty())
        {
            finalMergeArray[i++]=  secondQueue.remove();;
        }

        for (int printVal : finalMergeArray)
        {
            System.out.print(printVal);
        }
    }
}
