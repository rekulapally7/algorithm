package com.general;

import java.util.Arrays;

public class ChangeinaForeignCurrency
{
    public static void main(String[] args)
    {
        int[] input = {4, 17, 29};
        int targetMoney = 26;
        System.out.println(canGetExactChange(targetMoney, input));
    }

    // Add any helper functions you may need here

    static boolean canGetExactChange(int targetMoney, int[] denominations)
    {
        int[] dp = new int[targetMoney + 1];
        Arrays.fill(dp, targetMoney + 1);
        dp[0]=0;
        for (int i=0;i<=    targetMoney;i++)
        {
            for (int j = 0; j < denominations.length; j++)
            {
                if(denominations[j]<=i)
                {
                    dp[i] = Math.min(dp[i], 1 + dp[i - denominations[j]]);
                }
            }
        }
        return dp[targetMoney]<targetMoney?true:false;
    }
}
