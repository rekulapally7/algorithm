package com.general;

import java.util.*;

public class FindDuplicateNumber
{
    static int findDuplicate(int[] input)
    {

        Map<Integer,Integer> integerIntegerMap=new HashMap<>();
        integerIntegerMap.put(input[0],input[0]);
        for (int i=1;i<input.length;i++)
        {
            if(null!=integerIntegerMap.get(input[i]))
            {
                return input[i];
            }
            integerIntegerMap.put(input[i],input[i]);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(findDuplicate(new int[]{3,1,3,4,2}));
    }
}
