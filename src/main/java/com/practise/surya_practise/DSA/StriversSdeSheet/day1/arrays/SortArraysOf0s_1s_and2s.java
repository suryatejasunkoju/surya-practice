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
//                {2,0,2,1,1,0}
//                {0,2,1,0,2}
//                {2,1,0,1,0,1,0,1,0,2,2,2,2}
//                {1,0,1,0,1,0,1}
//                {1,0,1,0,2,0,1,1,0}
//                {0,0,0,2,2,1,1}
                {2,2,2,1,1,1,0,0,0}
                ;
        int zeroP=-1;
        int oneP=-1;
        int twoP=-1;
        if(nums[0]==1)
        {
            oneP=0;
        }
        else if (nums[0]==0)
        {
            zeroP=0;
        }
        else {
            twoP=0;
        }
        log.info("zeroP={}, oneP={}, twoP={}", zeroP, oneP, twoP);
        ArrayUtils.printIntArr(nums);
        for (int i = 1; i < nums.length; i++)
        {
            log.info("i={},zeroP={}, oneP={}, twoP={}", i, zeroP, oneP, twoP);
            int curr = nums[i];
            if(curr==0)
            {
                if(oneP!=-1)
                {
                    ArrayUtils.swap(nums, oneP, i);
                    if (twoP!=-1)
                    {
//                        ArrayUtils.swap(nums, oneP, twoP);
                        ArrayUtils.swap(nums, twoP, i);
                        twoP++;
                    }
                    oneP++;
                }
                else if (twoP!=-1)
                {
                    ArrayUtils.swap(nums, twoP, i);
                    zeroP=twoP;
                    twoP++;
                }
                //put this curr at 1st 1 position & that 1 at first 2 position(if exists)
                if (zeroP==-1)
                    zeroP=i;
            }
            else if (curr==1)
            {
                log.info("[[");
                if (twoP!=-1)
                {
                    log.info("====");
                    ArrayUtils.swap(nums, twoP, i);
                    if (oneP==-1){
                        oneP=twoP;
                    }
                    twoP++;
                }
                if (oneP==-1)
                    oneP=i;
            }
            else {
                if(twoP==-1)
                    twoP=i;
            }
            ArrayUtils.printIntArr(nums);
        }
        return null;
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }

}
