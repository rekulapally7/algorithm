package com.general;



public class LongestCommonString
{

    public String longestSubString(String a, String b)
    {
        char[] achr = a.toCharArray();
        char[] bchr = b.toCharArray();
        int alenth = achr.length;
        int blength = bchr.length;

        int[][] dp=new int[alenth+1][blength+1];
        int result=0;
        int x=0,y=0;
        for (int i=0;i<=alenth;i++)
        {
            for (int j = 0; j <= blength; j++)
            {
                if(i==0|| j==0)
                {
                    dp[i][j]=0;
                }
                else if(achr[i-1]==bchr[j-1])
                {
                    dp[i][j]=1+dp[i-1][j-1];
                    if(dp[i][j]>result)
                    {
                        result=dp[i][j];
                        x=i;
                        y=j;
                    }
                }
                else {
                    dp[i][j]=0;
                }

            }
        }
        String substring=null;
        if (x>y)
        {
            substring = a.substring(x - result, x);
        }
        else
        {
            substring = b.substring(y - result, y);
        }

        return substring;
    }


    public static String gcdOfStrings(String str1, String str2) {
        if (str2.length()>str1.length()){
            return gcdOfStrings(str2,str1);
        }
        if (str2.length()==0){
            return str1;
        }

        if (str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str1.indexOf(str2)+str2.length()),str2);

        }
        return "";



    }


    public static void main(String[] args)
    {
        System.out.println(gcdOfStrings("ABABABAB","ABAB"));
    }
}
