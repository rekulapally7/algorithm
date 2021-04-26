package com.general;

import java.util.LinkedList;
import java.util.List;

public class PartionEqualSubsetSum
{
    static boolean canWebSubSet(int[] inputArray, int sum, int index, int length)
    {
        if (sum == 0)
        {
            return true;
        }
        if (index >= length || sum < 0 )
        {
            return false;
        }
        return canWebSubSet(inputArray, sum - inputArray[index], ++index, length) || canWebSubSet(inputArray, sum, ++index, length);
    }

    static boolean partiionEqualSum(int[] inputArray)
    {
        if (inputArray.length == 0)
        {
            return false;
        }
        int sum = 0;
        for (int num : inputArray)
        {

            sum += num;
        }
        if (sum % 2 != 0)
        {
            return false;
        }
        return canWebSubSet(inputArray, sum /2, 0, inputArray.length);
    }

    public static void main(String[] args)
    {
        int[] inputArray = {1,2,5};
        System.out.println(partiionEqualSum(inputArray));
    }
}
