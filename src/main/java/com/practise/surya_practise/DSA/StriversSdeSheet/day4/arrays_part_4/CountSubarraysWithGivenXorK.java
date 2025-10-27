package com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountSubarraysWithGivenXorK implements DsaSolutionInterface
{
    @Override
    public Pair<String> bruteForce()
    {
        int[] nums = {5, 2, 9};
        int k = 7, result=0;
        for (int i = 0; i < nums.length; i++)
        {
            int xor=0;
            for (int j = i; j < nums.length; j++)
            {
                xor^=nums[j];
                if(xor==k)
                {
//                    log.info("i={}, j={}", i, j);
                    result++;
                }
            }
//            log.info("xor={}", xor);
        }
        log.info("result={}", result);
        return null;
    }

    @Override
    public Pair<String> goodApproach()
    {

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
