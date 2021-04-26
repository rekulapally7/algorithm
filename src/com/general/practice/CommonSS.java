package com.general.practice;

public class CommonSS
{
    static int commonSubString(String s, String s2, int m, int n)
    {
        if (m >= s.length() || n >= s2.length())
        {
            return 0;
        }
        if (s.charAt(m) == s2.charAt(n))
            return 1 + commonSubString(s, s2, m + 1, n + 1);

        return Math.max(commonSubString(s, s2, m + 1, n), commonSubString(s, s2, m, n + 1));
    }

    public static void main(String[] args)
    {
        //System.out.println(commonSubString("1234abc", "abc", 0, 0));
        System.out.println(commonSubStringDB("1234abcdd", "abcdde"));
    }

    static int commonSubStringDB(String s, String s2)
    {
        int result = 0;
        int[][] dp = new int[s.length()+1][s2.length()+1];
        for (int i = 0; i <= s.length(); i++)
            for (int j = 0; j <= s2.length(); j++)
            {
                if (i == 0 || j == 0)
                {
                    dp[i][j] = 0;
                    continue;
                }

                if (s.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    result = Math.max(result, dp[i][j]);
                }
                else
                {
                    dp[i][j] = 0;
                }
            }
        return result;
    }
}
