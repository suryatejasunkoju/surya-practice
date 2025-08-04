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

    public static <V> void copyMatrix(V[][] matrix, V[][] duplicate)
    {
        int colLen = matrix.length;
        int rowLen = matrix[0].length;
        for (int i = 0; i < colLen; i++)
        {
            for (int j = 0; j < rowLen; j++)
            {
                duplicate[i][j]=matrix[i][j];
            }
        }
    }

    public static void populateMatrixWithDefaultValues(int[][] matrix, int defaultValue)
    {
        int colLen = matrix.length;
        int rowLen = matrix[0].length;
        for (int i = 0; i < colLen; i++)
        {
            for (int j = 0; j < rowLen; j++)
            {
                matrix[i][j]=defaultValue;
            }
        }
    }
}
