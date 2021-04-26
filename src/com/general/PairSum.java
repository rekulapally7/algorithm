package com.general;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PairSum
{

    static int numberOfWays(int[] arr, int k)
    {
        if (arr.length == 0)
            return 0;
        int paircount = 0;
        Map<Integer, Queue<Integer>> pairMatch = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (null == pairMatch.get(arr[i]))
            {
                Queue<Integer> indexes = new LinkedList<>();
                indexes.add(arr[i]);
                pairMatch.put(arr[i], indexes);
            } else
            {
                Queue<Integer> indexes = pairMatch.get(arr[i]);
                indexes.add(arr[i]);
                pairMatch.put(arr[i], indexes);
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            int diff = k - arr[i];
            Queue<Integer> indexes = pairMatch.get(diff);
            if (null != indexes && indexes.size() > 0)
            {
                indexes.remove();
                indexes = pairMatch.get(arr[i]);
                if (null != indexes && indexes.size() > 0)
                {
                    indexes.remove();
                    paircount++;
                }
            }

        }
        return paircount;

    }

    public static void main(String[] args)
    {
        int[] input = {1, 2, 3, 4, 3};
        System.out.println(numberOfWays(input, 6));
    }
}
