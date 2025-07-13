package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Random;


@Slf4j
public class SortArraysOf0s_1s_and2s implements DsaSolutionInterface
{
    @Override
    public Pair<String> bruteForce() {
        //sort the array
        int[] nums = new int[]
                {2,0,2,1,1,0}
                ;
        Arrays.sort(nums);
        ArrayUtils.printIntArr(nums);
        return Pair.of("O(nlog(n))", "O(1)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        //take 3 variables to indicate the frequency of each distinct no.
        //populate those by iterating the complete array-O(n)
        //with those 3 variables, write values into arr with those frequencies in the required order.
        int[] nums = new int[]
                {2,0,2,1,1,0}
                ;
        ArrayUtils.printIntArr(nums);
        int zeroF=0, oneF=0, twoF=0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]==0){
                zeroF++;
            }
            else if (nums[i]==1) {
                oneF++;
            }
            else {
                twoF++;
            }
        }
        int i = 0;
        while(zeroF-->0){
            nums[i++]=0;
        }
        while(oneF-->0){
            nums[i++]=1;
        }
        while(twoF-->0){
            nums[i++]=2;
        }
        ArrayUtils.printIntArr(nums);
        return Pair.of("O(n)", "O(1)");
    }

    @Override
    public Pair<String> betterApproach()
    {
        //take 3 pointer variables,
        int[] nums = new int[]
                {2,0,2,1,1,0}
                ;
        Random random = new Random();
        for (int i = 0; i < nums.length; i++)
        {
            int zeroPointer=random.nextInt(nums.length);
            int onePointer=random.nextInt(nums.length);
            while(zeroPointer==onePointer)
            {
                onePointer=random.nextInt(nums.length);
            }
            int twoPointer=random.nextInt(nums.length);
            while(zeroPointer==twoPointer || twoPointer==onePointer)
            {
                twoPointer=random.nextInt(nums.length);
            }
            sortZeroOneTwoWithin3Pointers(zeroPointer, onePointer, twoPointer, nums);
        }
        return null;
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }

    private void sortZeroOneTwoWithin3Pointers(int zeroPointer, int onePointer, int twoPointer, int[] arr)
    {
        log.info("zeroPointer={}, onePointer={}, twoPointer={}", zeroPointer, onePointer, twoPointer);
        ArrayUtils.printIntArr(arr);
        if(arr[zeroPointer]>arr[onePointer])
        {
            ArrayUtils.swap(arr, zeroPointer, onePointer);
            if (arr[onePointer]>arr[twoPointer])
            {
                ArrayUtils.swap(arr, onePointer, twoPointer);
            }
        }
        else {
            if (arr[onePointer]>arr[twoPointer])
            {
                ArrayUtils.swap(arr, twoPointer, onePointer);
            }
        }
        ArrayUtils.printIntArr(arr);
        log.info("---------->");
    }
}
