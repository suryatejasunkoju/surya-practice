package com.practise.surya_practise.DSA.StriversSdeSheet.day3.arrays_part_3;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchInA2DMatrix implements DsaSolutionInterface {
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
    public Pair<String> betterApproach() {
        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 10;
        boolean result = false;
        int colSize = matrix.length;
        int rowSize = matrix[0].length;
        log.info("colSize={}, rowSize={}", colSize, rowSize);
        int start=0, end=(colSize*rowSize)-1;
        while (start<end)
        {
            int mid=(start+end)/2;
            log.info("start={}, end={}, mid={}", start, end, mid);
            int i=mid>rowSize ? mid%rowSize : mid, j=mid/rowSize;
            int midElem = matrix[i][j];
            log.info("i={}, j={}, midElem={}", i, j, midElem);
            if(midElem==target){
                result=true;
                break;
            }
            else if(midElem>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        log.info("result={}", result);
        return Pair.of("O(log(m*n))", "O(1)");
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }
}
