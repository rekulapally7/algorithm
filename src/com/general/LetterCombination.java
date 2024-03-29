package com.general;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination
{
    public static List<String> letterCombinations(String digits)
    {
        List<String> ans = new ArrayList<String>();
        if (digits == null || digits.length() == 0)
            return ans;
        char[][] map = new char[8][];
        map[0] = "abc".toCharArray();
        map[1] = "def".toCharArray();
        map[2] = "ghi".toCharArray();
        map[3] = "jkl".toCharArray();
        map[4] = "mno".toCharArray();
        map[5] = "pqrs".toCharArray();
        map[6] = "tuv".toCharArray();
        map[7] = "wxyz".toCharArray();

        char[] input = digits.toCharArray();
        ans.add("");
        for (char c : input)
        {
            ans= populateStrings(map[Character.getNumericValue(c)],ans);
        }
    return ans;
    }

    private static List<String> populateStrings(char[] chars, List<String> ans)
    {
        List<String> output=new ArrayList<>();
        for (String letterCombinartions:ans)
        {
            for (char  letter:chars)
            {
                output.add(letterCombinartions+letter);
            }
        }
    return output;
    }

    public static void main(String[] args)
    {
        List<String> combinations= letterCombinations("12");
        combinations.forEach(output-> System.out.println(output));
    }

}
