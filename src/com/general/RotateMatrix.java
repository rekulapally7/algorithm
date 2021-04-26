package com.general;

public class RotateMatrix
{
    public static void rotate(int[][] matrix)
    {
        int n = matrix.length;

        //Transform
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }

        for (int i = 0; i < n; i++)
            for (int j = i; j < n / 2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }

        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args)
    {
        int n=3;
        int[][] matrix=new int[n][n];
        int k=1;

        for (int i = 0; i < n; i++)
            for (int j = 0; j <n; j++)
                matrix[i][j]=k++;
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println("");
        }
       System.out.println("");
        System.out.println("");

        rotate(matrix);

    }
}
