package com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.MatrixUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RotateMatrix implements DsaSolutionInterface
{
    @Override
    public Pair<String> bruteForce() {
        //create new n*m matrix and populate it by making rows into cols & cols into rows of old matrix
        //then reverse all rows
        Integer[][] matrix=new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};
        MatrixUtils.printMatrix(matrix);
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        Integer[][] duplicate=new Integer[rowCount][colCount];
        for (int i = 0; i <rowCount; i++) {
            for (int j = 0; j<colCount; j++) {
                duplicate[i][j]=matrix[j][i];
            }
        }
        MatrixUtils.printMatrix(duplicate);
        for (int i = 0; i <rowCount; i++) {
            Integer[] currRow = duplicate[i];
            ArrayUtils.reverseGenericArr(currRow, 0, rowCount-1);
        }
        MatrixUtils.printMatrix(duplicate);
//        T(n)=O(n^2)+O(n^2)=2*O(n^2)=O(n^2)
        return Pair.of("O(n^2)", "O(n^2)");
    }

    @Override
    public Pair<String> goodApproach() 
    {
        //In duplicate arr, last col=reverse of 1st row of original matrix.
        // nth col = reverse of n-1-nth row of original matrix
        Integer[][] matrix=new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        Integer[][] duplicate=new Integer[n][n];
        MatrixUtils.printMatrix(matrix);
        for (int rowNo = 0; rowNo <n; rowNo++)
        {
            Integer[] currRow = matrix[rowNo];
            int colNo=n-1-rowNo;
            for (int j = 0; j<n; j++)
            {
                duplicate[j][colNo]=currRow[j];
            }
        }
        MatrixUtils.printMatrix(duplicate);
        MatrixUtils.copyMatrix(duplicate, matrix);
        MatrixUtils.printMatrix(matrix);
//        T(n)=2*O(n^2)=O(n^2), S(n)=O(n^2)
        return Pair.of("O(n^2)", "O(1)");
    }

    @Override
    public Pair<String> betterApproach()
    {
        //Within original matrix, make rows into cols(i.e, cols into rows automatically), reverse all rows, which is transpose of matrix
        Integer[][] matrix=new Integer[][]
                {{1,2,3},{4,5,6},{7,8,9}}
//                {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}
                ;
        int n = matrix.length;
        MatrixUtils.printMatrix(matrix);
        //making rows into cols
        for (int rowNo = 0; rowNo<n; rowNo++)//O(n!)
        {
            for (int colNo = rowNo; colNo < n; colNo++)
            {
//                log.info("rowCell={},{}, colCell={},{}", rowNo, colNo, colNo, rowNo);
                MatrixUtils.swap(matrix, rowNo, colNo, colNo, rowNo);
            }
        }
        MatrixUtils.printMatrix(matrix);
        //reversing all rows
        for (int rowNo = 0; rowNo<n; rowNo++)//O(n^2/2)
        {
            ArrayUtils.reverseGenericArr(matrix[rowNo], 0, n-1);
//            for (int colNo = 0; colNo < n/2; colNo++)
//            {
//                MatrixUtils.swap(matrix, rowNo, colNo, rowNo, n-1-colNo);
//            }
        }
        MatrixUtils.printMatrix(matrix);
        //time=O(n!)+O(n^2/2)=O(n^2)
        return Pair.of("O(n^2)", "O(1)");
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }
}
