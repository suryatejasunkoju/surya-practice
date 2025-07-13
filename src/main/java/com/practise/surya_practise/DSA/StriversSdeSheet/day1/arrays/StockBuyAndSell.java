package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockBuyAndSell implements DsaSolutionInterface
{

    @Override
    public Pair<String> bruteForce()
    {
        //for each element of arr, find maxDiff between curr element & elements next from curr element's position. Return max out of all these maxDiffs
        int[] nums = new int[]
//                {7,1,5,3,6,4}
                {7,6,4,3,1}
                ;
        int maxDiff = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++)
        {
            for (int j = i+1; j < length; j++)
            {
                maxDiff=Math.max(maxDiff, nums[j]-nums[i]);
            }
        }
        log.info("maxDiff={}", maxDiff);
        //time=(n-1)+(n-2)+(n-3)....3*2*1=O(n^2)
        return Pair.of("O(n^2)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        //for each element from last to first, at every step find max and do profit=max-currElement
//        or
//        for each element from start to last, find currMin & do profit=currElem-currMin
        //ActualProfit = max(all profits at each iteration)
        int[] nums = new int[]
                {7,1,5,3,6,4}
//                {7,6,4,3,1}
                ;
        int length = nums.length;
        int profit = 0, currMax=nums[length-1];
        ArrayUtils.printIntArr(nums);
        for (int i = length-2; i>=0; i--)
        {
            if(nums[i]>currMax)
            {
                currMax=nums[i];
            }
            profit=Math.max(profit, currMax-nums[i]);
            log.info("i={}, nums[i]={}, profit={}, currMax={}", i, nums[i], profit, currMax);
        }
        log.info("profit={}", profit);
        ArrayUtils.printIntArr(nums);
        return Pair.of("O(n)", "O(1)");
    }

    @Override
    public Pair<String> betterApproach() {
        return null;
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }
}
