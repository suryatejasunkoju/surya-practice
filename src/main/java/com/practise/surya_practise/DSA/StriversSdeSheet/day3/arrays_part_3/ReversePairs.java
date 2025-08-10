package com.practise.surya_practise.DSA.StriversSdeSheet.day3.arrays_part_3;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReversePairs implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce()
    {
        int[] nums = new int[]
//                {2, 4, 3, 5, 1, 3, 2, 3, 1}
                {2,4,3,5,1}
//                    {1,3,2,3,1}
                ;
        int length = nums.length;
        int reversePairsCount=0;
        //for i from 0 to n-1, for j from i+1 to n-1 if arr[i]>arr[j]*2 then reversePairsCount++
        for (int i = 0; i <length; i++)
        {
            int curr=nums[i];
            for (int j = i+1; j <length; j++)
            {
                if(curr>nums[j]*2)
                {
                    reversePairsCount++;
                }
            }
        }
        //time=(n-1)+(n-2)+(n-3)+...+3+2+1=O(n^2)
        log.info("reversePairsCount={}", reversePairsCount);
        return null;
    }

    @Override
    public Pair<String> goodApproach() {
        int[] nums = new int[]
                {2, 4, 3,  5, 1, 3, 2, 3, 1}
        //2XArr={4, 8, 6, 10, 2, 6, 4, 6, 2}
      //rvPrCnt={0, 2, 2,  3, 0, 1, 0, 1, 0}
//                {2,4,3,5,1}
//                    {1,3,2,3,1}
                ;
        int length = nums.length;
        int reversePairsCount=0;
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
