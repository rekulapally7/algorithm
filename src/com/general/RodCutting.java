package com.general;

import java.util.HashMap;
import java.util.Map;

public class RodCutting
{

   static Map<Integer,Integer> memorized=new HashMap<>();

    public static int rodCut(int length[],int price[], int volume)
    {
        if(length.length==0 ||  price.length==0|| volume==0)
            return 0;

        return helper(length,price,volume,length.length);
    }


    public static int helper(int length[],int price[], int volume,int l)
    {
        if(l==0|| volume==0)
            return 0;
         if(memorized.get(l)!=null)
             return memorized.get(l);

        if(length[l-1]<=volume )
        {
          memorized.put(l-1,Math.max(price[l - 1] + helper(length, price, volume - length[l - 1], l - 1), helper(length, price, volume, l - 1)));
          return memorized.get(l-1);
        }
        else
        {
            memorized.put(l-1, helper(length, price, volume, l - 1));
            return memorized.get(l-1);
        }
    }

    public static void main(String[] args)
    {
        int[] prices={60,100,120};
        int[] length={10,20,30};

        System.out.println(rodCut(length,prices,50));
    }


}
