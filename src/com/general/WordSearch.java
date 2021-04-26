package com.general;

public class WordSearch
{
    public static boolean exist(char[][] board, String word)
    {

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
            {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, word, 0))
                {
                    return true;
                }
            }
        return false;
    }

    private static boolean dfs(char[][] board, int i, int j, String word, int i1)
    {
        if (i1 == word.length())
            return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(i1))
            return false;
        i1 += 1;
        char temp=board[i][j];
        board[i][j] = ' ';
        boolean found= dfs(board, i + 1, j, word, i1) || dfs(board, i - 1, j, word, i1) || dfs(board, i + 1, j, word, i1) || dfs(board, i, j - 1, word, i1) || dfs(board, i, j + 1, word, i1);
        board[i][j]=temp;
        return found;
    }


    public static void main(String[] args)
    {

        char[][] board = {{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        String word = "AAB";
        System.out.println(exist(board,word));
    }
}
