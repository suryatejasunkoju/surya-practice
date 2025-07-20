package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays.related;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static com.practise.surya_practise.DSA.utils.ArrayUtils.printIntArr;

@Slf4j
public class Permutations implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce()
    {
        int[] nums = new int[]
                {1,2,3,4}
                ;
        printIntArr(nums);
        List<List<Integer>> result = new ArrayList<>();
        rec(nums, 0, result);
        log.info("result={}", result);
        return Pair.of("","");
    }

    private void rec(int[] nums, int level, List<List<Integer>> result)
    {
        if (level==nums.length)
        {
            List<Integer> list = ArrayUtils.fromIntArrToListInteger(nums);
            result.add(list);
        }
        else
        {
            for (int i = level; i < nums.length; i++)
            {
                int[] arr = ArrayUtils.formDuplicateIntArr(nums);
                ArrayUtils.swap(arr, level, i);
                rec(arr, level+1, result);
            }
        }
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
