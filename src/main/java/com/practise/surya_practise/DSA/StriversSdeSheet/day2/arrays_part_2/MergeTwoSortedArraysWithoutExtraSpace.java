package com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MergeTwoSortedArraysWithoutExtraSpace implements DsaSolutionInterface
{
    @Override
    public Pair<String> bruteForce() {
        //copy all elements of nums 2 into nums1 & do sort on nums1
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int n=nums2.length;
        int m=nums1.length-n;
        //time=n+O((m+n)log(m+n))
        for (int i = 0; i < n; i++)
        {
            nums1[m+i]=nums2[i];
        }
        ArrayUtils.printIntArr(nums1);
        ArrayUtils.printIntArr(nums2);
        Arrays.sort(nums1);
        ArrayUtils.printIntArr(nums1);
        ArrayUtils.printIntArr(nums2);
        return Pair.of("O((m+n)log(m+n))", "O(1)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        int[] nums1={1,2,3,4,0,0,0};
        int[] nums2={2,5,6};
        int n=nums2.length;
        int m=nums1.length-n;
        int[] temp = new int[m];
        log.info("goodApproach, m={}, n={}", m, n);
        for (int i = 0; i <m; i++)
        {
            temp[i]=nums1[i];
        }
        ArrayUtils.printIntArr(temp);
        ArrayUtils.printIntArr(nums1);
        ArrayUtils.printIntArr(nums2);
        //merging 2 arrays
        int firstP=0, secondP=0;
        int i=0;
        while(firstP<m && secondP<n)
        {
            int firstElem=temp[firstP];
            int secondElem=nums2[secondP];
            log.info("i={}, firstP={}, firstElem={}, secondP={}, secondElem={}", i, firstP, firstElem, secondP, secondElem);
            if(firstElem<secondElem)
            {
                nums1[i]=firstElem;
                firstP++;
            }
            else {
                nums1[i]=secondElem;
                secondP++;
            }
            i++;
        }
        log.info(">firstP={}, secondP={}", firstP, secondP);
        ArrayUtils.printIntArr(temp);
        ArrayUtils.printIntArr(nums1);
        ArrayUtils.printIntArr(nums2);
        if(secondP<n)
        {
            //copy remaining elements of num2 into num1
//            firstP--;
            log.info("firstP={}, secondP={}, i={}, m={}, n={}", firstP, secondP, i, m, n);
            while(i<m+n)
            {
                log.info("i={}, nums2[secondP]={}", i, nums2[secondP]);
                nums1[i]=nums2[secondP];
                i++;
                secondP++;
                ArrayUtils.printIntArr(temp);
                ArrayUtils.printIntArr(nums1);
                ArrayUtils.printIntArr(nums2);
            }
        }
        log.info("======>");
        ArrayUtils.printIntArr(temp);
        ArrayUtils.printIntArr(nums1);
        ArrayUtils.printIntArr(nums2);
        //time=m[moving elements to last within nums1]+(m+n)[merging 2 arrays]
        //=m+n
        return Pair.of("O(m+n)", "O(1)");
    }

    @Override
    public Pair<String> betterApproach()
    {
        //create temp arr containing non-zero elements of num1 & then do merging with 2 pointers for temp & num2 into num1
        int[] nums1={0};
        int[] nums2={1};
        int n=nums2.length;
        int m=nums1.length-n;
        log.info("betterApproach, m={}, n={}", m, n);
        //first move m elements to last of nums1 with same order
        //swap from first arr last element to last element of nums1
        int mid=m-1, end=nums1.length-1, i=0;
        while(i<m)//O(m)
        {
//            ArrayUtils.printIntArr(nums1);
            ArrayUtils.swap(nums1, end, mid);
            mid--;
            end--;
            i++;
        }
        log.info("-------");
        ArrayUtils.printIntArr(nums1);
        ArrayUtils.printIntArr(nums2);
        //merging 2 arrays
        int firstP=n, secondP=0;
        i=0;
        while(firstP<nums1.length && secondP<n)
        {
            int firstElem=nums1[firstP];
            int secondElem=nums2[secondP];
            log.info("i={}, firstP={}, firstElem={}, secondP={}, secondElem={}", i, firstP, firstElem, secondP, secondElem);
            if(firstElem<secondElem)
            {
                nums1[i]=firstElem;
                firstP++;
            }
            else {
                nums1[i]=secondElem;
                secondP++;
            }
            i++;
        }
        log.info("==>firstP={}, secondP={}", firstP, secondP);
        ArrayUtils.printIntArr(nums1);
        ArrayUtils.printIntArr(nums2);
        if(secondP<n)
        {
            //copy remaining elements of num2 into num1
//            firstP--;
            log.info("======>firstP={}, secondP={}", firstP, secondP);
            while(i<nums1.length)
            {
                nums1[i++]=nums2[secondP++];
            }
        }
        log.info("======>");
        ArrayUtils.printIntArr(nums1);
        ArrayUtils.printIntArr(nums2);
        return Pair.of("O(m+n)", "O(m)");
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }
}
