package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays.PascalsTriangle;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.NumberUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PascalsTriangleVariation1 implements DsaSolutionInterface
{
//    Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
    @Override
    public Pair<String> bruteForce() {
        //approach:find all pascal no.s till that row & col. From that List<List> return pascal(r,c)
        int r=9,c=5;
        int numRows=r, currRowNo=1;
        List<Integer> previousArr = new ArrayList<>();
        previousArr.add(1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(previousArr);
        if(numRows==1)
        {
            log.info("P({},{})={}", r, c, previousArr.get(0));
            ArrayUtils.printMatrix(result);
        }
        int currRowSize=2;
        currRowNo++;
        while(currRowSize<=numRows)//iterating for each row
        {
            int prevSize = previousArr.size();
            List<Integer> currRow = new ArrayList<>(currRowSize);
            log.info("currRowSize="+currRowSize+",previousArr="+previousArr);
            for(int colNo=0; colNo<currRowSize; colNo++)//iterating cols within a row
            {
                int currElem;
                if(colNo==0)
                {
                    currElem=previousArr.get(0);
                }
                else if(colNo==prevSize)
                {
                    currElem=previousArr.get(colNo-1);
                }
                else
                {
                    currElem=previousArr.get(colNo)+previousArr.get(colNo-1);
                }
                if(colNo==c-1 && r==currRowNo){
                    log.info("P({},{})={}", r, c, currElem);
                    break;
                }
                currRow.add(currElem);
            }
            log.info("currRow="+currRow);
            result.add(currRow);
            previousArr=currRow;
            currRowSize++;
            currRowNo++;
        }
        ArrayUtils.printMatrix(result);
        return null;
    }

    @Override
    public Pair<String> goodApproach() {
        //approach:
        // pascal(r,c)=rCc=Combination(r,c)=(r!)/((r-c)!*(c)!) when r, c are 0 based
        //=Combination(r-1,c-1)=(r-1!)/((r-c)!*(c-1)!) when r, c are 1 based
        int r=9,c=5;
        int Pcr = NumberUtils.findFactorial(r-1)/(NumberUtils.findFactorial(r-c)* NumberUtils.findFactorial(c-1));
        log.info("P({},{})={}", r, c, Pcr);
        //time=r[for r!]+(r-c)[for (r-c)!]+c[for c!]=O(r)+O(r-c)+O(c)=O(2r)=O(r)
        //space=O(1)
        return Pair.of("O(r)", "O(1)");
    }

    @Override
    public Pair<String> betterApproach() {
        //approach:
        // pascal(r,c)
        // Combination(r,c)=(r!)/((r-c)!*(c)!) when r, c are 0 based
        //=[(r-c+1)(r-c+2)(r-c+3)(r-c+4)(r-c+5)....(r-2)(r-1)(r)]/c!
        int r=9,c=5;
        int Pcr = NumberUtils.findMultiplicationFrom(r-c+1, r-1, 1)/ NumberUtils.findFactorial(c-1);
        log.info("P({},{})={}", r, c, Pcr);
        //time=(r-c)[for numerator]+c[for denominator]=O(r-c)+O(c)=O(r)
        //space=O(1)
        return Pair.of("O(r)", "O(1)");
    }

    @Override
    public Pair<String> bestApproach()
    {
        /*
        1
        1 1
        1 2 1
        1 3 3   1
        1 4 6   4  1
        1 5 10 10  5  1
        1 6 15 20  15 6  1
        1 7 21 35  35 21 7 1
        */

        //8th row: in (r-1)C(c-1), rowNo=8, so r=8-1=7.
        //1   7      21                35                35                   21                      7                   1
//                                ||
        //1 (7/1) (7*6/1*2) (7*6*5/1*2*3) (7*6*5*4/1*2*3*4) (7*6*5*4*3/1*2*3*4*5) (7*6*5*4*3*2/1*2*3*4*5*6) (7*6*5*4*3*2*1/1*2*3*4*5*6*7)
//                                ||
        //1 (previousElem*r/1) (previousElem*(r-1)/2) (previousElem*(r-2)/3) (previousElem*(r-3)/4) (previousElem*(r-4)/5) (previousElem*(r-5)/6) (previousElem*(r-6)/7)
        //In each row, first elem is anyway 1, and every next element=previousElementInThatRow*(rowNo-i)/(i+1)
        //where i in range:0 to  6[ie., r-1]

        //(or)

//        when currColNo!=1 && currColNo!=r,
//        Pcr=(prevNumerator*(r-i)/prevDenominator*i);


        //time=O(colNo) for find P(r,c) in that row.
        //time=O(colNo)=O(rowNo) for finding P(r,c) for a row
        //             >As max colNo in rowNo row is rowNo only.
        //time=[firstRow->O(1)]+[2ndRow->O(2)]+[3rdRow->O(3)]+...[nthRow->O(n)]=O((rowNo*(rowNo-1))/2)=O(rowNo^2) for finding P(r,c) triangle

        int r=8,c=8;
        int Pcr = -1;
        if(c==1 || r==c){
            Pcr=1;
            log.info("P({},{})={}", r, c, Pcr);
        }
        else {
            int i=1, rowMinusOne=r-1, prevNumerator=1, prevDenominator=1, colMinusOne=c-1;
            int currNumerator=1;
            int currDenominator=1;
            while (i<c)
            {
                currNumerator=prevNumerator*(r-i);
                currDenominator=prevDenominator*i;
                log.info("currNumerator={}, currDenominator={}", currNumerator, currDenominator);
                Pcr=(currNumerator/currDenominator);
                log.info("=>P({},{})={}", r, i+1, Pcr);
                prevNumerator=currNumerator;
                prevDenominator=currDenominator;
                i++;
            }
        }
        return Pair.of("O(c)", "O(1)");
    }
}
