package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolution;
import com.practise.surya_practise.utils.DsaArrayUtils;
import com.practise.surya_practise.utils.Pair;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleVariation2 implements DsaSolution {
//    Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.
    @Override
    public Pair<String> bruteForce() {
        //approach:find all pascal no.s till that row & col. From that List<List> return last row
        //bruteForceApproach of Variation1
        return Pair.of("O(r!)", "O(r!)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        //approach: find nCr() of all cells in that row and add these into list and return list. use normal nCr()
        //time=O(2r)*O(r)=O(2*r^2)=O(r^2)
        return Pair.of("O(r^2)", "O(1)");
    }

    @Override
    public Pair<String> betterApproach()
    {
        //approach: find nCr() of all cells in that row and these into list and return list. use optimized nCr()
        //time=O(r)*O(r)=O(r^2)
        return Pair.of("O(r^2)", "O(1)");
    }

    @Override
    public Pair<String> bestApproach() {
        //use bestApproach in Variation1
        //time=O(r)
        return Pair.of("O(r)", "O(1)");
    }
}
