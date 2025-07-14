package com.practise.surya_practise.DSA.utils;

import java.util.List;

public class MatrixUtils
{
    public static <V> void printMatrix(V[][] matrix)
    {
        System.out.println("[");
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ,");
            }
            System.out.println("],");
        }
        System.out.println("]");
    }

    public static void printMatrix(List<List<Integer>> matrix)
    {
        System.out.println("[");
        for (int i = 0; i < matrix.size(); i++)
        {
            System.out.print("[");
            for (int j = 0; j < matrix.get(0).size(); j++)
            {
                System.out.print(matrix.get(i).get(j)+" ,");
            }
            System.out.println("],");
        }
        System.out.println("]");
    }

    public static <T> void swap(T[][] matrix, int r, int j, int r1, int c1)
    {
        T tmp = matrix[r][j];
        matrix[r][j] = matrix[r1][c1];
        matrix[r1][c1] = tmp;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("[");
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ,");
            }
            System.out.println("],");
        }
        System.out.println("]");
    }
}
