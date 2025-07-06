package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolution;
import com.practise.surya_practise.utils.DsaArrayUtils;
import com.practise.surya_practise.utils.Pair;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleVariation3 implements DsaSolution {
//        Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
    @Override
    public Pair<String> bruteForce()
    {
        //approach: bruteForceApproach of Variation1
        return Pair.of("O(r!)","O(1)");
    }

    @Override
    public Pair<String> goodApproach() {
        //approach: goodForceApproach of Variation1 for every P(r,c) in every row & col
        //In each row, for each col->P(r,c) takes 2*r time, ie., (2r)^r time within a row r. ~=r^r time
        //time=O(1)[firstRow]+O(2*2)[2ndRow]+O(3*3*3)[3rdRow]+O(4*4*4*4)[4thRow]+...O(r^r)
        // =O(1+2^2+3^3+4^4...+r^r) This is very much greater than r!(above approach)[because r!<r^r, & O(1+2^2+3^3+4^4...+r^r) contains r^r]
        return Pair.of("O(1+2^2+3^3+4^4...+r^r)","O(1)");
    }

    @Override
    public Pair<String> betterApproach() {
        //same as above, but r^r time within a row instead of (2r)^r time like in above method
        return Pair.of("O(1+2^2+3^3+4^4...+r^r)","O(1)");
    }

    @Override
    public Pair<String> bestApproach() {
        //use bestApproach of Variation1
        //time=O(r!)
        return null;
    }
}
