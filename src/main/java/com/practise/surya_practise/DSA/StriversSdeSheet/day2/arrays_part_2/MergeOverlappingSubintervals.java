package com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.MatrixUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class MergeOverlappingSubintervals implements DsaSolutionInterface {

    private static int idx=0;
    @Override
    public Pair<String> bruteForce()
    {
        //first do sorting based on first element of each interval
        int[][] intervals = new int[][]
                {{1,2},{2,3},{3,4},{4,5},{5,6},{7,9},{10,10},{11,11},{12,15},{15,16},{16,17}}
//                {{1,4},{4,5}}
//                {{1,3},{2,6},{8,10},{15,18}}
//                {{5, 6}, {4, 5}, {1, 3}, {2, 4}}
                ;
        int length = intervals.length;
        MatrixUtils.printMatrix(intervals);
        Arrays.sort(intervals,
                Comparator.comparingInt(
                        (int[] arr)->arr[0]
                ).thenComparingInt(
                        arr->arr[1]
                )
        );
        MatrixUtils.printMatrix(intervals);
        List<int[]> result=new ArrayList<>();
        while (idx<length)
        {
            int[] merged = recursivelyMergeAt(idx, intervals[idx], intervals);
            log.info("bruteForce, merged={}, idx={}", merged, idx);
            idx+=1;
            result.add(merged);
        }
        log.info("bruteForce, result=\n");
        ArrayUtils.printList(result);
        return Pair.of("O(nlogn)","O(1)");
    }

    int[] recursivelyMergeAt(int index, int[] currPair, int[][] nums)
    {
        if(index==nums.length-1)
        {
            idx=index;
            return currPair;
        }
        else
        {
            int[] nextPair = nums[index+1];
            log.info("recursivelyMergeAt, index={}", index);
            log.info("outside, currPair={}, nextPair={}", currPair, nextPair);
            if(isIntervalsMergeable(currPair, nextPair))
            {
                log.info("inside, index={}, currPair={}, nextPair={}", index, currPair, nextPair);
                int[] mergedPair = coordinatesAfterMerging(currPair, nextPair);
                log.info("mergedPair={}", mergedPair);
                return recursivelyMergeAt(index+1, mergedPair, nums);
            }
            idx=index;
            return currPair;
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

    private boolean isIntervalsMergeable(int[] firstInterval, int[] secondInterval)
    {
//        log.info("isIntervalsMergeable,firstInterval={}, secondInterval={}", firstInterval, secondInterval);
        //        log.info("isMergeable={}", isMergeable);
        return (firstInterval[1] >= secondInterval[0]);
    }

    private int[] coordinatesAfterMerging(int[] firstInterval, int[] secondInterval)
    {
        int[] result=new int[2];
        result[0]=Math.min(firstInterval[0], secondInterval[0]);
        result[1]=Math.max(firstInterval[1], secondInterval[1]);
        return result;
    }
}
