package com.practise.surya_practise.DSA.StriversSdeSheet;


import com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays.*;
import com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays.PascalsTriangle.PascalsTriangleVariation1;
import com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays.related.Permutations;
import com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2.FindTheDuplicateInAnArrayOfNPlusOneIntegers;
import com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2.MergeOverlappingSubintervals;
import com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2.MergeTwoSortedArraysWithoutExtraSpace;
import com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2.RotateMatrix;
import com.practise.surya_practise.DSA.StriversSdeSheet.day3.arrays_part_3.GridUniquePaths;
import com.practise.surya_practise.DSA.StriversSdeSheet.day3.arrays_part_3.ReversePairs;
import com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4.LongestSubstringWithoutRepeat;
import com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4.TwoSumProblem;
import com.practise.surya_practise.DSA.miscellaneous.UglyNumber2;

public class DsaClient
{
    public static void run()
    {
//        miscellaneous();
//        day1();
        day2();
//        day3();
//        day4();
//        day5();
    }
    private static void miscellaneous()
    {
        new UglyNumber2().goodApproach();
    }
    private static void day1()
    {
        new MaximumSubArraySum().goodApproach();
        new NextPermutation().bruteForce();
        new SetMatrixZeroes().betterApproach();
        new SortArraysOf0s_1s_and2s().betterApproach();
        new StockBuyAndSell().goodApproach();
        new PascalsTriangleVariation1().goodApproach();

        new Permutations().bruteForce();
    }

    private static void day2(){
        new FindTheDuplicateInAnArrayOfNPlusOneIntegers().bruteForce();
//        new MergeOverlappingSubintervals().bruteForce();
//        new MergeTwoSortedArraysWithoutExtraSpace().betterApproach();
//        new RotateMatrix().betterApproach();
    }
    private static void day3(){
//        new ReversePairs().bruteForce();
//        new GridUniquePaths().goodApproach();
    }
    private static void day4()
    {
        new LongestSubstringWithoutRepeat().goodApproach();
//        new TwoSumProblem().betterApproach();
    }
    private static void day5(){

    }
    private static void day6(){

    }
    private static void day7(){

    }
}
