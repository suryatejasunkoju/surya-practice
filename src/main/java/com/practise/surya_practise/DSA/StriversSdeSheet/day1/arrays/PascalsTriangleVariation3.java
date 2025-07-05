package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolution;
import com.practise.surya_practise.utils.DsaUtils;
import com.practise.surya_practise.utils.Pair;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleVariation3 implements DsaSolution {
    @Override
    public Pair<String> bruteForce()
    {
//        Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
        int numRows=1;
        List<Integer> previousArr = new ArrayList<>();
        previousArr.add(1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(previousArr);
        if(numRows==1)
        {
            DsaUtils.printMatrix(result);
        }
        // System.out.println("previousArr="+previousArr);
        int currRowSize=2;
        while(currRowSize<=numRows)
        {
            int prevSize = previousArr.size();
            int currSize = prevSize+1;
            List<Integer> currRow = new ArrayList<>(currSize);
            System.out.println("currRowSize="+currRowSize+",previousArr="+previousArr);
            for(int i=0; i<currSize; i++)
            {
                if(i==0)
                {
                    currRow.add(previousArr.get(0));
                }
                else if(i==prevSize){
                    currRow.add(previousArr.get(i-1));
                }
                else
                {
                    int currElem=previousArr.get(i)+previousArr.get(i-1);
                    currRow.add(currElem);
                }
            }
            System.out.println("currRow="+currRow);
            result.add(currRow);
            previousArr=currRow;
            currRowSize++;
        }
        DsaUtils.printMatrix(result);

        return Pair.of("O(n!)","O(n!)");
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
