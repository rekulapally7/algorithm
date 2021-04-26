package com.general;

public class LongestPalimdrome
{
    public static String longestPalindrome(String s)
    {

        StringBuilder stringBuilder = new StringBuilder(s);
        String reverse = stringBuilder.reverse().toString();
        return new LongestCommonString().longestSubString(s,reverse);

    }

    public static void main(String[] args)
    {
        System.out.println(longestPalindrome("cbbd"));
    }
}
