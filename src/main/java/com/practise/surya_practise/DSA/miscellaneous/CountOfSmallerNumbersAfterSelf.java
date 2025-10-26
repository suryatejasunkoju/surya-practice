package com.practise.surya_practise.DSA.miscellaneous;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountOfSmallerNumbersAfterSelf implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce() {
        int[] nums = {5,2,6,1};
        int len= nums.length;
        int[] counts = new int[len];
        for (int i = len-1; i >=0; i--)
        {
            int curr=nums[i], count=0;
            for (int j = len-1; j >=i; j--)
            {
                if(nums[j]<curr)
                {
                    count++;
                }
            }
            counts[i]=count;
        }
        log.info("counts={}", counts);
        return null;
    }

    @Override
    public Pair<String> goodApproach() {
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
