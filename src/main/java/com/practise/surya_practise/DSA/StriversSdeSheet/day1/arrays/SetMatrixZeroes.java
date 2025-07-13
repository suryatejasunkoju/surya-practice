package com.practise.surya_practise.DSA.StriversSdeSheet.day1.arrays;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.Pair;

public class SetMatrixZeroes implements DsaSolutionInterface {
    @Override
    public Pair<String> bruteForce() {
        //given a matrix of m x n elements, if an element is 0, set its entire row and column to 0.
        //https://leetcode.com/problems/set-matrix-zeroes/description/
        //iterate through each element of array, and making zeroes in row & column of that cell won't work,
        //because zeroes present in cells within the same row or column would be overridden with these newly inserted zeroes.
        //so create duplicate matrix having same elements as input matrix.
        //while iterating through duplicate matrix, making zeroes in rows & columns of input matrix by seeing a zero in duplicate matrix.
        Integer[][] matrix=new Integer[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        Integer[][] duplicate=new Integer[rowCount][colCount];
        for (int i = 0; i <rowCount; i++) {
            for (int j = 0; j <colCount; j++) {
                duplicate[i][j]=matrix[i][j];
            }
        }
        ArrayUtils.printMatrix(duplicate);

        for (int i = 0; i <rowCount; i++) {
            for (int j = 0; j <colCount; j++) {
                Integer currElem = duplicate[i][j];
                if (currElem==0)
                {
                    ArrayUtils.makeAllZeroesInRowAndCol(i,j, matrix);
                }
            }
        }
        ArrayUtils.printMatrix(matrix);
        //Time=O(m*n)+O((m*n)*(m+n))=O(mn(m+n))
        return Pair.of("O(mn(m+n))", "O(m*n)");
    }

    @Override
    public Pair<String> goodApproach() {
        //We don't need to duplicate matrix to store 0 values instead we mark within the matrix.
        //Approach:
        //iterate through all cells of matrix.
        //for each cell, if it contains 0 then mark that row & column as -1[no which cant be present in any cell of matrix] except if that row or column contains zero.
        //after iteration is done, replace all -1 with 0, which will give the answer.
        //here, we are marking row & col values to -1 instead of 0, because 0 overrides actual non-zero values in that row & column. So, while iterating that row we consider cell as zero even if its initially not a zero.
        Integer[][] matrix=new Integer[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        ArrayUtils.printMatrix(matrix);
        for (int rowNo = 0; rowNo <rowCount; rowNo++)
        {
            for (int colNo = 0; colNo <colCount; colNo++)
            {
                if(matrix[rowNo][colNo]==0)
                {
                    //makeAllAs -1 InRow if cell is not 0
                    // O(m) time
                    for (int i = 0; i <rowCount; i++) {
                        if (matrix[i][colNo]!=0) {
                            matrix[i][colNo]=-1;
                        }
                    }
                    //makeAllAs -1 InCol if cell is not 0
                    // O(n) time
                    for (int i = 0; i <rowCount; i++) {
                        if (matrix[rowNo][i]!=0)
                            matrix[rowNo][i]=-1;
                    }
                    // Total time = O(m+n) inside if block
                }
            }
        }
        ArrayUtils.printMatrix(matrix);
        for (int rowNo = 0; rowNo <rowCount; rowNo++)
        {
            for (int colNo = 0; colNo <colCount; colNo++)
            {
                if(matrix[rowNo][colNo]==-1)
                {
                    matrix[rowNo][colNo]=0;
                }
            }
        }
        ArrayUtils.printMatrix(matrix);
        return Pair.of("O(mn*(m+n))", "O(1)");
    }

    @Override
    public Pair<String> betterApproach() {
        //instead of duplicate matrix, we can have 2 arrays.
        // 1st representing zero occurrences in all rows. 2nd representing zero occurrences in all cols.
        Integer[][] matrix=new Integer[][]
                //                {{1,1,1},{1,0,1},{1,1,1}};
                {{0,1}};
//        {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//                {{1,2,3,4,5},{6,7,0,9,10},{0,0,11,13,14}};
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        Integer[] rowArr = new Integer[colCount];
        Integer[] colArr = new Integer[rowCount];
        ArrayUtils.printMatrix(matrix);
//        DsaUtils.printArr(rowArr);
//        DsaUtils.printArr(colArr);
        for (int i = 0; i <rowCount; i++) {
            for (int j = 0; j <colCount; j++) {
                if(matrix[i][j]==0)
                {
                    rowArr[j]=0;
                    colArr[i]=0;
                }
                else
                {
                    if(rowArr[j]==null || rowArr[j]!=0)
                    {
                        rowArr[j]=1;
                    }
                    if(colArr[i]==null || colArr[i]!=0)
                    {
                        colArr[i]=1;
                    }
                }
            }
        }
        ArrayUtils.printArr(rowArr);
        ArrayUtils.printArr(colArr);
        for (int i = 0; i < rowArr.length; i++)
        {
            if(rowArr[i]==0)
                ArrayUtils.makeAllAsValueInCol(matrix, i, 0);
        }
        for (int i = 0; i < colArr.length; i++) {
            if(colArr[i]==0)
                ArrayUtils.makeAllAsValueInRow(matrix, i, 0);
        }
        ArrayUtils.printMatrix(matrix);
        return Pair.of("O(mn)", "O(m+n)");
    }

    @Override
    public Pair<String> bestApproach()
    {
        //Approach: instead of row Arr & col Arr, we make use of
        // 1st row of matrix as row Arr &  1st col of matrix as col Arr
        // But matrix[0][0] represents 2 values, 1 of rowArr[0] & another of colArr[0].
        //To resolve this conflict, we use a rowArrFirstElement variable and matrix[0][0] represents rowArr[0]/colArr[0] value.
        Integer[][] matrix=new Integer[][]
//                {{1,1,1},{1,0,1},{1,1,1}};
                {{0,1}};
//        {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//                {{1,2,3,4,5},{6,7,0,9,10},{0,0,11,13,14}};
        //here having colArr[0] as rowArrFirstElement variable
        int rowArrFirstElement=-1;
        int rowLength=matrix[0].length;
        int colLength=matrix.length;
        ArrayUtils.printMatrix(matrix);
        System.out.println("rowArrFirstElement="+rowArrFirstElement+",rowLength="+rowLength+",colLength="+colLength);
        System.out.println("marking zeroes upward vertically & left side horizontally at same time");

        for (int i = 0; i <colLength; i++)//iterating through each row
        {
            for (int j = 0; j <rowLength; j++)//iterating through each cell in that row
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    if(j==0)
                    {
                        rowArrFirstElement=0;
                    }
                    else{
                        matrix[0][j]=0;
                    }
                }
            }
        }
        ArrayUtils.printMatrix(matrix);
        System.out.println("rowArrFirstElement="+rowArrFirstElement);
        System.out.println("making rows as zeros based on first column");
        for (int rowNo = 1; rowNo < colLength; rowNo++)//iterating through each row
        {
//            if(rowNo==0 && rowArrFirstElement==0)
//            {
//                DsaUtils.makeAllAsValueInRowWithinColRange(matrix, rowNo,0,1,rowLength);
//            }
//            else
            if(matrix[rowNo][0]==0)
            {
                ArrayUtils.makeAllAsValueInRowWithinColRange(matrix, rowNo,0,1,rowLength);
            }
        }
        System.out.println("making cols as zeros based on first row");
        for (int colNo = 1; colNo < rowLength; colNo++)
        {
            if(matrix[0][colNo]==0)
            {
                ArrayUtils.makeAllAsValueInColWithinRowRange(matrix, colNo,0,1, colLength);
            }
        }
        ArrayUtils.printMatrix(matrix);
        System.out.println("marking first row as zeroes based on matrix[0][0]");
        if(matrix[0][0]==0)
        {
            ArrayUtils.makeAllAsValueInRowWithinColRange(matrix, 0,0,0, rowLength);
        }
        ArrayUtils.printMatrix(matrix);
        System.out.println("marking first col as zeroes based on rowArrFirstElement");
        if(rowArrFirstElement==0){
            ArrayUtils.makeAllAsValueInColWithinRowRange(matrix, 0,0,0, colLength);
        }
        ArrayUtils.printMatrix(matrix);
//        time=2*O(mn)
        return Pair.of("O(mn)", "O(1)");
    }
}
