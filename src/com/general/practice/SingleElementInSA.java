package com.general.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SingleElementInSA
{
    public static void singleNonDuplicate(int[] nums) {

        Map<Integer,Integer> countMap=new HashMap<>();
        PriorityQueue<Integer> integerPriorityQueue=new PriorityQueue<>((o1, o2) -> countMap.get(o1)-countMap.get(o2));
        for (int num: nums)
        {
            countMap.put(num,countMap.getOrDefault(num,0)+1);
            integerPriorityQueue.add(num);
        }

        System.out.println(integerPriorityQueue.remove());
    }
    public static void main(String[] args)
    {
        singleNonDuplicate(new int[]{1,1,2,2,3,3,4,4,8,8,9});
    }
}
