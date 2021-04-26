package com.general;

public class LongestCommonSS
{

    public static int longestCommonSubsequence(String text1, String text2)
    {
        return longestCommonSubsequence(text1, text2, 0, 0);
    }


    public static int longestCommonSubsequence(String text1, String text2, int m, int n)
    {
        if (m >= text1.length() || n >= text2.length())
            return 0;


        if (text1.charAt(m) == text2.charAt(n))
        {
            return 1 + longestCommonSubsequence(text1, text2, m + 1, n + 1);
        }
        return Math.max(longestCommonSubsequence(text1, text2, m + 1, n), longestCommonSubsequence(text1, text2, m, n + 1));
    }

    public static void main(String[] args)
    {
        String text1 = "abcde", text2 = "abcde";
        System.out.println(dpr(text1, text2));
    }

    public static int dpr(String text1, String text2)
    {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 0; i < text1.length(); i++)
            for (int j = 0; j < text2.length(); j++)
            {
                if (i == 0 || j == 0)
                {
                    dp[i][j] = 0;
                }
                if (text1.charAt(i) == text2.charAt(j))
                {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else
                {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        return dp[text1.length() - 1] [text2.length() - 1];
    }


}
