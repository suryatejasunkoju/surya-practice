package com.practise.surya_practise.DSA.StriversSdeSheet.day3.arrays_part_3;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchInA2DMatrix implements DsaSolutionInterface
{
    @Override
    public Pair<String> bruteForce() {
        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 6;
        boolean result = false;
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        for (int i = 0; i <rowCount; i++) {
            for (int j = 0; j <colCount; j++) {
                int elem = matrix[i][j];
                log.info("i={}, j={}, elem={}", i, j, elem);
                if(elem ==target){
                    result=true;
                    break;
                }
                else if (elem>target){
                    break;
                }
            }
        }
        log.info("result={}", result);
        return Pair.of("O(m*n)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach() {
        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 1;
        boolean result = false;
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int prevRowStartingElem=matrix[0][0], elemExistingRowNo=0;
        for (int i = 1; i <rowCount; i++)
        {
            int rowStartingElem = matrix[i][0];
            log.info("rowStartingElem={}", rowStartingElem);
            if (prevRowStartingElem<=target && target<rowStartingElem){
                elemExistingRowNo=i-1;
                log.info("elemExistingRowNo={}", elemExistingRowNo);
                break;
            }
        }
        for (int i = 0; i <colCount; i++) {
            int elem = matrix[elemExistingRowNo][i];
            if(elem ==target){
                result=true;
                break;
            }
            else if (elem>target){
                break;
            }
        }
        log.info("result={}", result);
        return Pair.of("O(m+n)", "O(1)");
    }

    @Override
    public Pair<String> betterApproach()
    {
        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 16;
        boolean result = false;
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int prevRowStartingElem=matrix[0][0], elemExistingRowNo=0;
        for (int i = 1; i <rowCount; i++)
        {
            int rowStartingElem = matrix[i][0];
            log.info("betterApproach, rowStartingElem={}", rowStartingElem);
            if (prevRowStartingElem<=target && target<rowStartingElem){
                elemExistingRowNo=i-1;
                log.info("betterApproach, elemExistingRowNo={}", elemExistingRowNo);
                break;
            }
        }
        int start=0, end=colCount-1;
        while (start<end)
        {
            int mid = (start + end) / 2;
            int midElem = matrix[elemExistingRowNo][mid];
            log.info("before:start={}, end={}, mid={}, midElem={}", start, end, mid, midElem);
            if(midElem==target)
            {
                result=true;
                break;
            }
            else if(midElem>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            log.info("after:start={}, end={}, mid={}, midElem={}", start, end, mid, midElem);
        }
        if(start==end && target==matrix[elemExistingRowNo][start])
        {
            result=true;
        }
        log.info("betterApproach, start={}, end={}, result={}", start, end, result);
        return Pair.of("O(log(m))+O(n)", "O(1)");
    }

    @Override
    public Pair<String> bestApproach()
    {
        int[][]matrix = {{1},{3}};

        //matrix={{1}}
        //target=0
        
        //matrix={{1},{3}}
        //target=3

        //approach: doing binary search on array with entire matrix no.s as if it's a single array.
        int target = 3;
        boolean result = false;
        int noOfRows = matrix.length;
        int noOfCols = matrix[0].length;
        log.info("bestApproach, noOfRows={}, noOfCols={}", noOfRows, noOfCols);
        int start=0, end=(noOfRows*noOfCols)-1;
        while (start<=end)
        {
            int mid=(start+end)/2;
            log.info("bestApproach, start={}, end={}, mid={}", start, end, mid);
            int rowNo=mid/noOfCols;
            int colNo=mid%noOfCols;
            int midElem = matrix[rowNo][colNo];
            log.info("bestApproach, rowNo={}, colNo={}, midElem={}", rowNo, colNo, midElem);
            if(midElem==target)
            {
                result=true;
                break;
            }
            else if(midElem>target)
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        log.info("bestApproach, start={}, end={}, result={}", start, end, result);
        return Pair.of("O(log(m*n))", "O(1)");
    }
}
