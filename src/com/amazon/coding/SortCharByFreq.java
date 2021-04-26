package com.amazon.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharByFreq
{

    static String sortFreq(String s)
    {
        Map<Character, Integer> counts = new HashMap<>();

        //TC : O(N)
        for (char c : s.toCharArray())
        {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>((o1, o2) -> counts.get(o2)-counts.get(o1));
        characterPriorityQueue.addAll(counts.keySet());
        //TC O(NLOGN)
        StringBuilder sortCharFreq=new StringBuilder();
        while(!characterPriorityQueue.isEmpty())
        {
            Character top=characterPriorityQueue.remove();
            for(int i=0;i< counts.getOrDefault(top, 0);i++)
                sortCharFreq.append(top);
        }
        //TC(O(N))
        return sortCharFreq.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(sortFreq("tree"));
        System.out.println(sortFreq("cccaaa"));
        System.out.println(sortFreq("Aabb"));
    }
}
