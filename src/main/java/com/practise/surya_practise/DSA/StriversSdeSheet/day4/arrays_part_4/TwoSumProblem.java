package com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TwoSumProblem implements DsaSolutionInterface
{
    @Override
    public Pair<String> bruteForce()
    {
        //approach:
        //for each element from 0 to len-1
        //check for other element starting from next index of curr element, so that
        //both having sum as target.
        int[] nums = new int[]
//                {3,2,4}
//                {2,7,11,15}
                    {3,3}
                ;
        int target=6;
        int len= nums.length;
        int[] ans=new int[2];
        boolean breaked=false;
        ArrayUtils.printIntArr(nums);
        ArrayUtils.printIntArr(ans);
        for (int i = 0; i <len; i++)
        {
            int firstNum=nums[i];
            ans[0]=i;
            for (int j = i+1; j < len; j++)
            {
                int secondNum = nums[j];
                if(firstNum+secondNum==target)
                {
                    log.info("found answer");
                    ans[1]=j;
                    breaked=true;
                    break;
                }
            }
            if(breaked){
                break;
            }
//            log.info("i={}", i);
//            ArrayUtils.printIntArr(ans);
        }
        log.info("--after");
        ArrayUtils.printIntArr(ans);
        return Pair.of("O(n^2)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        //approach:
        //populate hashMap with element, index
        //iterate arr from start to end, while doing so, check whether hashMap has target-currElement
        //if found its the ans
        int[] nums = new int[]
//                {3,2,4}
                {2,7,11,15}
//                {3,3}
                ;
        int target=9;
        int len= nums.length;
        int[] ans=new int[2];
        ArrayUtils.printIntArr(nums);
        Map<Integer, Integer> numIndexMap=new HashMap<>(len);
        for (int i = 0; i <len; i++)
        {
            numIndexMap.put(nums[i], i);
        }
        log.info("target={}, numIndexMap={}", target, numIndexMap);
        for (int i = 0; i <len; i++)
        {
            ans[0]=i;
            if(numIndexMap.containsKey(target-nums[i]) && numIndexMap.get(target-nums[i])!=i){
                log.info("found answer");
                ans[1]=numIndexMap.get(target-nums[i]);
                break;
            }
        }
        ArrayUtils.printIntArr(ans);
        return Pair.of("O(n)", "O(n)");
    }

    @Override
    public Pair<String> betterApproach()
    {
        //approach:
        //sort arr in asc order
        //have 2 pointers as start=0 & end=len-1
        //if sum of elements at start&end is:
        // >target, end--
        // <target, start++
        //==target, found ans
        //do this until start<end

        int[] nums = new int[]
                {3,2,4}
//                {2,7,11,15}
//                {3,3}
                ;
        int target=6;
        int len= nums.length;
        int[] ans=new int[2];
        // ArrayUtils.printIntArr(nums);
        int[] duplicateNums = ArrayUtils.formDuplicateIntArr(nums);
        Arrays.sort(duplicateNums);
        int firstNum=-1, secondNum=-1;
        //2 pointer approach:-
        int start=0, end=len-1;
        while (start<end)
        {
            int sum = duplicateNums[start] + duplicateNums[end];
            System.out.println("currSum="+sum+", startNum="+duplicateNums[start]+", endNum="+duplicateNums[end]);
            if(sum==target)
            {
                firstNum=duplicateNums[start];
                secondNum=duplicateNums[end];
                System.out.println("found ans, nums are firstNum="+firstNum+", secondNum="+secondNum);
                break;
            }
            if(target>0){
                if(sum<target){
                    start++;
                }
                else {
                    end--;
                }
            }
            else{
                if(sum<target){
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        int idxFoundCount=0;
        for (int i = 0; i < len; i++)
        {
            System.out.println("idxFoundCount="+idxFoundCount+",i="+i+",nums[i]="+nums[i]+",firstNum="+firstNum+",secondNum="+secondNum);
            if((nums[i]==firstNum || nums[i]==secondNum) )
            {
                if(idxFoundCount==0)
                {
                    ans[0]=i;
                    idxFoundCount++;
                }
                else{
                    ans[1]=i;
                    break;
                }
            }
        }
        ArrayUtils.printIntArr(ans);
        return Pair.of("O(nlogn)", "O(1)");
    }

    @Override
    public Pair<String> bestApproach() {
        return Pair.of("O(n log n)", "O(1)");
    }
}
