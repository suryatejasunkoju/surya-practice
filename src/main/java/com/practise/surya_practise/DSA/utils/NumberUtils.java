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
    public static int consecutiveNosSum(int start, int end)
    {
        //gives sum from start to end[both inclusive]
        //[start,end]=[3,8]
        //arr=[3,4,5,6,7,8]
        //sum=3+4+5+6+7+8=(2*6)+[1+2+3+4+5+6]=commonFactor*arrSize+[sum of 1 to n nos]
        if (start==end){
            return start;
        }
        int sum=0, arrSize=end-start+1;
        int commonFactor = start - 1;
        sum+=(commonFactor *arrSize);
        int sumFrom1ToN=(arrSize*(arrSize+1))/2;
        sum+=sumFrom1ToN;
        return sum;
    }
    public static int consecutiveNosSquaresSum(int start, int end)
    {
        int sum=0, arrSize=end-start+1, commonFactor=start-1;
        //series:start^2, (start+1)^2, (start+2)^2, (start+3)^2, ... end^2
        //seriesSize = end-start+1, commonFactor=start-1
        //sum of series=(sum of squares of nos from 1 to n) + [commonFactor^2*seriesSize] + 2*commonFactor*[sum of nos from 1 to n]
        int sumOf1ToNSquares=(arrSize*(arrSize+1)*(2*arrSize+1))/6;
        int sumOf1ToN=consecutiveNosSum(1, arrSize);
        if(start==1){
            return sumOf1ToNSquares;
        }
        sum+=sumOf1ToNSquares;
        sum+=(commonFactor*commonFactor*arrSize);
        sum+=(2*commonFactor*sumOf1ToN);
        return sum;
    }
}
