package com.practise.surya_practise.DSA.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils
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

    public static void printIntArr(int[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ,");
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
        for (int i = 0; i <rowCount; i++) {
            matrix[i][colNo]=value;
        }
    }

    public static void makeAllAsValueInRow(Integer[][] matrix, int rowNo, int value)
    {
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

    public static void swap(int[] arr, int i, int j)
    {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static int[] formDuplicateIntArr(int[] nums)
    {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            arr[i]=nums[i];
        }
        return arr;
    }

    public static List<Integer> fromIntArrToListInteger(int[] nums)
    {
        List<Integer> list= new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++)
        {
            list.add(nums[i]);
        }
        return list;
    }
    public static void reverse(int[] arr, int i, int j)
    {
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static <V> void reverseGenericArr(V[] arr, int i, int j)
    {
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static <V> void swap(V[] arr, int i, int j)
    {
        V tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
