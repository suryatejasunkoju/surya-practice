package com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class FindTheDuplicateInAnArrayOfNPlusOneIntegers implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce()
    {
        int[] nums={1,3,4,2,2};
        int result = 0;
        Arrays.sort(nums);
        log.info("nums={}", nums);
        for (int i = 0; i < nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
            {
                log.info("i={}", i);
                result=nums[i];
                break;
            }
        }
        log.info("result={}", result);
        return Pair.of("O(nlogn+n)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach() {
        //while iterating for each element in arr, iterate from the next element till end of arr to find duplicate
        int[] nums={1,3,4,2,2};
        int length = nums.length;
        int result = 0;
        for (int i = 0; i <length; i++)
        {
            int curr=nums[i];
            for (int j = i+1; j <length; j++) {
                if(curr==nums[j]){
                    result=nums[j];
                    break;
                }
            }
        }
        log.info("result={}", result);
        return Pair.of("O(n!)", "O(n)");
    }

    @Override
    public Pair<String> betterApproach() {
        int[] nums={1,3,4,2,2};
        int length = nums.length;
        int result = 0;
        Map<Integer, Integer> freqMap=new HashMap<>(length);
        for (int i = 0; i <length; i++)
        {
            int num = nums[i];
            Integer freq = freqMap.getOrDefault(num, 0);
            log.info("num={},freq={}", num, freq);
            if(freq==1)
            {
                result=num;
                break;
            }
            else{
                freqMap.put(num, 1);
            }
        }
        log.info("result={}", result);
        return Pair.of("O(n)", "O(n)");
    }

    @Override
    public Pair<String> bestApproach() {
        int[] nums={3,3,3,3,3};
        int length = nums.length;
        int result = 0;
        //since, every no withing nums[] is in range 0 to nums.length-1, we can
        // iterate within nums[] by taking values as indices. This traversal will make a linked list with a loop.
        //the starting of loop gives the duplicate element.
        int slow=0, fast=0;
        slow=nums[slow];
        fast=nums[nums[fast]];
        while(slow!=fast)
        {
            log.info("before,slow={}, fast={}", slow, fast);
            slow=nums[slow]; //1,3,2
            fast=nums[nums[fast]];//3,4,2
            log.info("after,slow={}, fast={}", slow, fast);
        }
        log.info("outside, 1, slow={}, fast={}", slow, fast);
        slow=0;
        slow=nums[slow];
        fast=nums[fast];
        while(slow!=fast)
        {
            log.info("before, slow={}, fast={}", slow, fast);
            slow=nums[slow];
            fast=nums[fast];
            log.info("after, slow={}, fast={}", slow, fast);
        }
        log.info("outside, 2, slow={}, fast={}", slow, fast);
        result=slow; //result=fast;
        log.info("result={}", result);
        return Pair.of("O(n)", "O(1)");
    }
}
