package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays;

import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaximumSubArraySum implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce()
    {
        log.info("MaximumSubArraySum");
        int[] nums = new int[]{5,4,-1,7,8};
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        //for each subarray find sum & find max out of all these sums
        for (int subArrSize = 1; subArrSize <=n; subArrSize++)
        {
            int size=subArrSize;
            for (int start = 0; start<n; start++)
            {
                int currStart=start;
                int currEnd=start+size;
                int currSum=0;
                for (int i = currStart; i <=currEnd; i++)
                {
                    currSum+=nums[i];
                    maxSum=Math.max(currSum, maxSum);
                }
            }
        }

        log.info("maxSum={}", maxSum);
        return Pair.of("O(n^3)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        //my approach:
        //        log.info("MaximumSubArraySum");
        int[] nums = new int[]{5,4,-1,7,8};
        int length = nums.length;
        int[] left = new int[length];

        //forming left sum array
        int s=0;
        for (int i = 0; i < length; i++)
        {
            s+=nums[i];
            left[i]=s;
        }

        int maxSum = Integer.MIN_VALUE;
        //for each subarray find sum & find max out of all these sums
        for (int i = 0; i < length; i++)
        {
            for (int j = i; j < length; j++)
            {
                log.info("==>({},{})", i, j);
                //instead of subarray iteration, finding sum by left array only[no need of right array]
                //we can do the same with left array without right array
                int currSubArrSum= ArrayUtils.findSumBtw(i, j, nums, left);
//                log.info("i={}, maxSum={}, currSubArrSum={}", i, maxSum, currSubArrSum);
                maxSum = Math.max(maxSum, currSubArrSum);
            }
        }
        log.info("maxSum={}", maxSum);
        return Pair.of("O(n^2)", "O(n)");
    }

    @Override
    public Pair<String> betterApproach()
    {
        int[] nums = new int[]{5,4,-1,7,8};
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        //for each starting index of subarray, find all possible sub-arr sums from that startingIndex till n. And find max out of all sums
        for (int subArrStartIndex = 0; subArrStartIndex < n; subArrStartIndex++)
        {
            //for every subarray of each length starting from subArrStartIndex, find sums
            int currSum=0;
            for (int j = subArrStartIndex; j < n; j++)
            {
                currSum+=nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        log.info("maxSum={}", maxSum);
        return Pair.of("O(n^2)", "O(1)");
    }

    @Override
    public Pair<String> bestApproach()
    {
        //Kadane's Algo
        int[] nums = new int[]{1,2,-1,-2,-4,-124,2,-4,34};
//        max=Integer.MIN_VALUE;
//        currSubArraySum=0;

//        subarray from (0,0);
//        currSubArraySum=1, bcoz 1>0
//        max=currSubArraySum=1, bcoz currSubArraySum>max

//        subarray from (0,1);
//        currSubArraySum=1+2=3, bcoz (1+2)>0
//        max=currSubArraySum=3, bcoz currSubArraySum>max

//        At every step, we are including arr element in currSubArraySum if its making currSubArraySum>0 after adding it.

//        subarray from (0,2);
//        currSubArraySum=3-1=2, bcoz (3-1)>0
//        max=currSubArraySum=3, bcoz currSubArraySum>max

//        even though adding curr arr element to currSubArraySum may decrease its value, we still add it,
//        b'coz in future that positive value of currSubArraySum may add with next element which may
//        combinely give max currSubArraySum.

        //if adding curr arr element makes currSubArraySum<0 then we don't add it. And we consider next subarray from curr arr element + 1 position & makes currSubArraySum=0


        int length = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < length; i++)
        {
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }

            if(sum<0)//if this if-block is above if-block then it fails for [-1] example
            {
                sum=0;
            }
        }
        log.info("maxSum={}", maxSum);
        return Pair.of("O(n)", "O(1)");
    }
}
