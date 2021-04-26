package com.general;

import java.util.*;



public class IntervalMerge
{
    class IntervalComparator implements Comparator<int[]>
    {
        @Override
        public int compare(int[] o1, int[] o2)
        {
            return o1[0]-o2[0];
        }

    }
    public int[][] merge(int[][] intervals)
    {
        Collections.sort(Arrays.asList(intervals),new IntervalComparator());
        LinkedList<int[]> linkedList=new LinkedList();

        for (int[] interval:intervals)
        {
            if(linkedList.isEmpty()|| interval[0]>linkedList.getLast()[1])
            {
                linkedList.add(interval);
            }
            else
            {
                linkedList.getLast()[1]=Math.max(linkedList.getLast()[1],interval[1]);
            }
        }
        return  linkedList.toArray(new int[linkedList.size()][]);
    }

    public static void main(String[] args)
    {
        int a[][]= {{1,3},{2,6},{8,10},{15,18}};
        int[][]output= new IntervalMerge().merge(a);
        for (int[] temp:output)
        {
            System.out.println(temp[0]+""+temp[1]);
        }
    }
}
