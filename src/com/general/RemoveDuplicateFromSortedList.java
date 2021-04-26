package com.general;

import java.util.Arrays;

public class RemoveDuplicateFromSortedList
{
    public static void main(String[] args)
    {
        int[] removeDupe = {1,1, 2};

        int index = 1;
        for (int i = 0; i < removeDupe.length-1; i++)
        {
            if (removeDupe[i] != removeDupe[i + 1])
            {
                removeDupe[index++] = removeDupe[i+1];
            }
        }
        System.out.println(index);
    }
}
