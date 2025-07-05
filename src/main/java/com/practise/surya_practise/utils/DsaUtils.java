package com.practise.surya_practise.utils;

import java.util.List;

public class DsaUtils
{
    public static <V> void printArrElemsInNewLine(V[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i="+i+",elem="+arr[i]);
        }
        System.out.println();
    }
    public static <V> void printArr(V[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ,");
        }
        System.out.println("]");
    }

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

    public static int findSumBtw(int i, int j, int[] nums, int[] left)
    {
        int sum=0;
        if(i==j)
        {
            sum=nums[i];
        }
        else
        {
//            if left index i=0 then subtracting nothing else subtracting left[i-1]
            sum=left[j]-(i>0 ? left[i-1] :  0);
        }
        return sum;
    }

    public static void makeAllZeroesInRowAndCol(int row, int col, Integer[][] matrix)
    {
        int rowSize = matrix[0].length;
        for (int i = 0; i < rowSize; i++) {
            matrix[row][i]=0;
        }
        int colSize = matrix.length;
        for (int i = 0; i <colSize; i++) {
            matrix[i][col]=0;
        }
    }

    public static void makeAllAsValueInCol(Integer[][] matrix, int colNo, int value) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        for (int i = 0; i <rowCount; i++) {
            matrix[i][colNo]=value;
        }
    }

    public static void makeAllAsValueInRow(Integer[][] matrix, int rowNo, int value) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        for (int i = 0; i <colCount; i++)
        {
            matrix[rowNo][i]=value;
        }
    }

    public static void makeAllAsValueInRowWithinColRange(Integer[][] matrix, int rowNo, int value, int colStart, int colEnd)
    {
        for (int i = colStart; i<colEnd; i++)
        {
            matrix[rowNo][i]=value;
        }
    }

    public static void makeAllAsValueInColWithinRowRange(Integer[][] matrix, int colNo, int value, int rowStart, int rowEnd)
    {
        for (int i = rowStart; i<rowEnd; i++)
        {
            matrix[i][colNo]=value;
        }
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
}
