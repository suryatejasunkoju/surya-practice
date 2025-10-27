package com.practise.surya_practise.DSA.StriversSdeSheet;


import com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays.*;
import com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays.PascalsTriangle.PascalsTriangleVariation1;
import com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays.related.Permutations;
import com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2.*;
import com.practise.surya_practise.DSA.StriversSdeSheet.day3.arrays_part_3.SearchInA2DMatrix;
import com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4.LongestConsecutiveSequence;
import com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4.LongestSubArrayWithSumK;
import com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4.LongestSubstringWithoutRepeatingChars;
import com.practise.surya_practise.DSA.miscellaneous.CountOfSmallerNumbersAfterSelf;
import com.practise.surya_practise.DSA.miscellaneous.UglyNumber2;

public class DsaClient
{
    public static void run()
    {
//        miscellaneous();
//        day1();
//        day2();
        day3();
//        day4();
//        day5();
    }
    private static void miscellaneous()
    {
//        new UglyNumber2().goodApproach();
        new CountOfSmallerNumbersAfterSelf().bruteForce();
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
//        new FindTheDuplicateInAnArrayOfNPlusOneIntegers().bruteForce();
        new RepeatAndMissingNumber().bestApproach1();
//        new MergeOverlappingSubintervals().bruteForce();
//        new MergeTwoSortedArraysWithoutExtraSpace().betterApproach();
//        new RotateMatrix().betterApproach();
    }
    private static void day3(){
        new SearchInA2DMatrix().bestApproach();
//        new ReversePairs().bruteForce();
//        new GridUniquePaths().goodApproach();
    }
    private static void day4()
    {
//        new LongestSubstringWithoutRepeatingChars().betterApproach();
//        new LongestConsecutiveSequence().goodApproach();
//        new TwoSumProblem().betterApproach();
        new LongestSubArrayWithSumK().goodApproach();
    }
    private static void day5(){

    }
    private static void day6(){

    }
    private static void day7(){

    }
}
