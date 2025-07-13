package com.practise.surya_practise.DSA.utils;

public class NumberUtils
{
    public static int findFactorial(int n)
    {
        if(n<=0){
            return 1;
        }
        int result=1;
        while(n>1){
            result*=1;
            n--;
        }
        return result;
    }

    public static int findMultiplicationFrom(int start, int end, int incr)
    {
        if(start>end)
            return -1;

        if(start==end){
            return start;
        }
        int result=1;
        while(start<end)
        {
            result*=start;
            start+=incr;
        }

        return result;
    }
}
