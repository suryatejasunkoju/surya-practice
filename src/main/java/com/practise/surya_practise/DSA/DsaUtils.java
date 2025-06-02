package com.practise.surya_practise.DSA;

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
}
