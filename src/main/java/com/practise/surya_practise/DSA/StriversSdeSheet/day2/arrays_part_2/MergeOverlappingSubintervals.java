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
        //first do sorting
        int[][] nums = new int[][]
//                {{1,3},{2,6},{8,10},{15,18}}
                {{5, 6}, {5, 4}, {1, 3}, {2, 4}}
                ;
        MatrixUtils.printMatrix(nums);
        Arrays.sort(nums, Comparator.comparing(
                arr->arr[0]
        ));
        MatrixUtils.printMatrix(nums);
        boolean intervalsMergeable = isIntervalsMergeable(nums[2], nums[3]);
        log.info("intervalsMergeable={}, coordinatesAfterMerging={}", intervalsMergeable, coordinatesAfterMerging(nums[2], nums[3]));
        return Pair.of("O(nlogn)","O(1)");
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
        result[0]=Math.max(firstInterval[0], secondInterval[0]);
        result[1]=Math.max(firstInterval[1], secondInterval[1]);
        return result;
    }
}
