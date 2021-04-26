package com.general;

import java.util.ArrayList;
import java.util.List;

public class BreakStringIntoWords
{
    public static void main(String[] args)
    {
        String  s = "leetcode";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(new BreakStringIntoWords().wordBreak(s,wordDict));
    }


    public boolean wordBreak(String s, List<String> wordDict)
    {
        if (s.length() == 0)
            return false;
        int i = 0;

        return bfs(s, i, wordDict);
    }


    boolean bfs(String s, int i, List<String> wordDict)
    {
        if (i == s.length())
            return true;
        for(int index=i;i<=s.length();i++)
        {
            String word = s.substring(index, i);
            if (wordDict.contains(word))
            {

                if (bfs(s, i, wordDict))
                    return true;
            }
        }
        return false;
    }

}
