package com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.MatrixUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;

@Slf4j
public class MergeOverlappingSubintervals implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce() {
        //first do sorting based on first element of each interval
        int[][] nums = new int[][]
//                {{1,3},{2,6},{8,10},{15,18}}
                {{5, 6}, {5, 4}, {1, 3}, {2, 4}}
                ;
        int length = nums.length;
        MatrixUtils.printMatrix(nums);
        Arrays.sort(nums, Comparator.comparing(
                arr->arr[0]
        ));
        MatrixUtils.printMatrix(nums);
        int[] prevPair=nums[0];
        for (int i = 0; i <length; i++)
        {
            int[] currPair = nums[i];
            boolean intervalsMergeable = isIntervalsMergeable(prevPair, currPair);
            log.info("prevPair={}, currPair={}, intervalsMergeable={}", prevPair, currPair, intervalsMergeable);
            if(intervalsMergeable)
            {
                int[] mergedPair = coordinatesAfterMerging(prevPair, currPair);
                log.info("mergedPair={}", mergedPair);
                if(arePairsEqual(prevPair, mergedPair)){

                }
            }
        }
        return Pair.of("O(nlogn)","O(1)");
    }
    boolean arePairsEqual(int[] p1, int[] p2)
    {
        return p1[0]==p2[0] && p1[1]==p2[1];
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
        return (firstInterval[1]>=secondInterval[0]) || (firstInterval[0]<=secondInterval[1]);
    }
    private int[] coordinatesAfterMerging(int[] firstInterval, int[] secondInterval)
    {
        int[] result=new int[2];
        result[0]=Math.min(firstInterval[0], secondInterval[0]);
        result[1]=Math.max(firstInterval[1], secondInterval[1]);
        return result;
    }
}
