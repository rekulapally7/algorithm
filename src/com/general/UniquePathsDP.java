package com.general;

public class UniquePathsDP
{

    static int matrixRec(int m, int n)
    {
        if(m==1 || n==1)
        return 1;

        return matrixRec(m-1,n)+ matrixRec(m,n-1);

    }


    public static void main(String[] args)
    {
        System.out.println(matrixDP(51,9));
    }


    static int matrixDP(int m, int n)
    {
        int[][] dp=new int[m][n];

        for(int i=0; i<n; i++)
        {
            dp[0][i]=1;
        }

        for(int i=0; i<m; i++)
        {
            dp[i][0]=1;
        }

      for (int i=1;i<m;i++)
          for (int j=1;j<n;j++)
              dp[i][j]=dp[i-1][j]+dp[i][j-1];

        return dp[m-1][n-1];
    }


}