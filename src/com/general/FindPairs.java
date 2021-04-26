package com.general;

public class FindPairs
{
    static int[] findPairs(int[] input, int sum)
    {
         int[] output=new int[2];

        for (int k = 0; k < input.length; k++)
        {
            int diff=sum-input[k];
            output[0]=input[k];
            for (int i = k+1, j = input.length - 1; i < input.length && j > i; i++, j--)
            {
                if(diff==input[i])
                {
                    output[1]=input[i];
                    return output;
                }
                if(diff==input[j])
                {
                    output[1]=input[j];
                    return output;
                }
            }
        }
        return output;
    }

    public static void main(String[] args)
    {
        int[] output= findPairs(new int[]{2, 6, 3, 9, 11},12);
        System.out.println(output[0]);
        System.out.println(output[1]);
    }
}
