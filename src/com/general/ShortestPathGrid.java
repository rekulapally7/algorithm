package com.general;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathGrid
{


    public static void main(String[] args)
    {
        char[][] m = {{'.', '.', '.', '#', '.', '.', '.'},
                      {'.', '#', '.', '.', '.', '#', '.'},
                      {'.', '#', '.', '#', '.', '.', '.'},
                      {'.', '.', '#', '#', '.', '.', '.'},
                      {'#', '.', '#', '#', '.', 'E', '.'}};
        System.out.println(new ShortestPathGrid().findPath(m, 5, 7));
    }

    public int findPath(char m[][], int R, int C)
    {
        int move_count = 0;
        boolean reached_end = false;
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, 1, -1};

        boolean visited[][] = new boolean[R][C];
        Queue<Integer> rq = new LinkedList();
        Queue<Integer> cq = new LinkedList();
        int sr = 0, sc = 0;
        rq.add(sr);
        cq.add(sc);
        visited[sr][sc] = true;
        while (!rq.isEmpty())
        {
            sr = rq.remove();
            sc = cq.remove();
            if (m[sr][sc] == 'E')
            {
                reached_end = true;
                break;
            }


            //Add neighbours
            for (int i = 0; i < 4; i++)
            {
                int nextR = sr + dr[i];
                int nextC = sc + dc[i];

                if (nextR < 0 || nextR >= R || nextC < 0 || nextC >= C)
                {
                    continue;
                }
                if (m[nextR][nextC] == '#' || visited[nextR][nextC])
                    continue;
                visited[nextR][nextC]=true;
                rq.add(nextR);
                cq.add(nextC);
            }
            move_count++;
        }

        if (reached_end)
            return move_count;
        return -1;
    }
}
