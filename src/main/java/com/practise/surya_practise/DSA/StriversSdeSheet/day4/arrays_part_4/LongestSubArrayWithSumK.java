package com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class LongestSubArrayWithSumK implements DsaSolutionInterface {
//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
    @Override
    public Pair<String> bruteForce() {
//        Input: nums = [10, 5, 2, 7, 1, 9],  k=15
//        Output: 4
        //find all sub array sums with sum=k & find max length out of all those
        int[] nums = {-3, 2, 1};
        int k=6, len=nums.length, maxSubArrLen=0;
        for (int i = 0; i <len; i++)
        {
            int currSum=0;
            log.info("i={}", i);
            for (int j = i; j <len; j++)
            {
                int currSubArrSize=j-i+1;
                currSum+=nums[j];
                log.info("j={}, currSum={}, currSubArrSize={}", j, currSum, currSubArrSize);
                if(currSum==k)
                {
                    maxSubArrLen=Math.max(maxSubArrLen, currSubArrSize);
                }
            }
        }
        log.info("maxSubArrLen={}", maxSubArrLen);
        return Pair.of("O(n!)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach()
    {

        //Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
        //Output: 6
        //Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
        //Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5
        //Output: 5
        //Explanation: Only subarray with sum = -5 is [-5, 8, -14, 2, 4] of length 5.
        //Input: arr[] = [10, -10, 20, 30], k = 5
        //Output: 0
        //Explanation: No subarray with sum = 5 is present in arr[].
        int[] nums = {10, 5, 2, 7, 1, -10};
        int k=15, len=nums.length, maxSubArrLen=0;
        long[] prefixSumArr = new long[len];
        Map<Long, Integer> prefixSumMap=new HashMap<>();
        prefixSumMap.put(0L,-1);
        long sum=0;
        for(int i=0; i<len; i++)
        {
            sum+=nums[i];
            if(!prefixSumMap.containsKey(sum))
            {
                prefixSumMap.put(sum, i);
            }
            prefixSumArr[i]=sum;
        }
        log.info("nums={}", nums);
        log.info("prefixSumArr={}", prefixSumArr);
        log.info("prefixSumMap={}", prefixSumMap);
        sum=0;
        for(int i=0; i<len; i++)
        {
            sum+=nums[i];
            long sumMinusK = sum - k;
            log.info("sumMinusK={}", sumMinusK);
            if(prefixSumMap.containsKey(sumMinusK))
            {
                Integer prevSumIndex = prefixSumMap.get(sumMinusK);
                int currSubArrLen = i - prevSumIndex;
                maxSubArrLen=Math.max(maxSubArrLen, currSubArrLen);
                log.info("indices:[start={},end={}]=, maxSubArrLen={}", prevSumIndex, i, maxSubArrLen);
            }
        }
        log.info("maxSubArrLen={}", maxSubArrLen);
        return null;
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
