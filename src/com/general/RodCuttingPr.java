package com.general;


public class RodCuttingPr
{

    static int rodCut(int[] lengths, int[] prices, int totalLength)
    {
        if (lengths.length == 0 || prices.length == 0 || totalLength == 0)
        {
            return 0;
        }
        return rodCutRec(lengths, prices, totalLength, lengths.length);
    }

    static int rodCutRec(int[] lengths, int[] prices, int totalLength, int l)
    {
        int sum = 0;
        if (totalLength == 0 |l==0)
        {
            return 0;
        }
        if (totalLength-lengths[l-1]>=0 )
        {
            sum =  Math.max(prices[l-1] +rodCutRec(lengths, prices, totalLength - lengths[l-1], l -1), rodCutRec(lengths, prices, totalLength, l -1 ));
        }
        else
        {
            sum =  rodCutRec(lengths, prices, totalLength, l - 1);
        }
        return sum;
    }


    public static void main(String[] args)
    {
        int[] prices = {60, 100, 120};
        int[] length = {10, 20, 30};

        System.out.println(rodCut(length, prices, 50));
    }

}
