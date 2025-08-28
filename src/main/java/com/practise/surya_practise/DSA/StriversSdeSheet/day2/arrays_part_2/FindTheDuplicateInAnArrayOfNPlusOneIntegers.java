package com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class FindTheDuplicateInAnArrayOfNPlusOneIntegers implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce()
    {
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
