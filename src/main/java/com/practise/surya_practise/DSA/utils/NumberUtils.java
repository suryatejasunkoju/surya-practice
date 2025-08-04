package com.practise.surya_practise.DSA.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

    public static int nCr(int n, int r)
    {
        int result=1, numerator=1, denominator=1;
        for (int i = 1; i <=r; i++)
        {
            int num=(i-1);
            log.info("i={}, num={}, (n-num)={}", i, num, (n-num));
            numerator*=(n-num);
            denominator*=i;
        }
        log.info("numerator={}, denominator={}", numerator, denominator);
        result=numerator/denominator;
        log.info("result={}", result);
        return result;
    }
}
