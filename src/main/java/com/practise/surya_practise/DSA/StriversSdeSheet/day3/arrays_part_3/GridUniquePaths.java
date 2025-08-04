package com.practise.surya_practise.DSA.StriversSdeSheet.day3.arrays_part_3;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.MatrixUtils;
import com.practise.surya_practise.DSA.utils.NumberUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GridUniquePaths implements DsaSolutionInterface {

    private static int methodCalls=0;

    @Override
    public Pair<String> bruteForce() {
        int m = 3, n = 7;

        //recursion
//        f(i,j)=0 if i=0&j=0
//              =1 if i=0 or j=0
//              =f(i-1,j)+f(i,j-1)

//        finishing point is at i=m-1, j=n-1;
        log.info("before,bruteForce,methodCalls={}", methodCalls);
        int result = f(m-1, n-1);
        log.info("after,bruteForce,methodCalls={}", methodCalls);
        log.info("bruteForce,result={}", result);
        return Pair.of("O((m+n)Cm)", "O(Max(m,n))");
    }
    int f(int i, int j)
    {
        methodCalls++;
        if(i==0 && j==0){
            return 0;
        }
        else if(i==0 || j==0){
            return 1;
        }
        return f(i-1,j)+f(i,j-1);
    }

    int recursionWithDp(int i, int j, int[][] dp)
    {
        methodCalls++;
        log.info("recursionWithDp,i={},j={}, dp={}", i,j, dp);
        if(i==0 && j==0)
        {
            dp[i][j]=0;
            return 0;
        }
        else if(i==0 || j==0)
        {
            dp[i][j]=1;
            return 1;
        }
        if(dp[i][j]==-1)
        {
            dp[i][j]=recursionWithDp(i-1,j, dp)+recursionWithDp(i,j-1, dp);
        }
        return dp[i][j];
    }

    @Override
    public Pair<String> goodApproach()
    {

        int m = 3, n = 2;
        int[][] dp=new int[m][n];
        MatrixUtils.populateMatrixWithDefaultValues(dp, -1);
        MatrixUtils.printMatrix(dp);
        log.info("before,bestApproach,methodCalls={}", methodCalls);
        int result = recursionWithDp(m - 1, n - 1, dp);
        log.info("after,bestApproach,methodCalls={}", methodCalls);
        MatrixUtils.printMatrix(dp);
        log.info("bestApproach,result={}", result);
        return Pair.of("O((m+n)Cm)", "O(Max(m,n))");
    }

    @Override
    public Pair<String> betterApproach()
    {
        int m = 3, n = 7;
        //create matrix of size m*n or n*m
        //set all 1s in 1st row & col
        int[][] matrix=new int[m][n];
        for (int i = 0; i < m; i++)
        {
            matrix[i][0]=1;
        }
        for (int i = 0; i < n; i++)
        {
            matrix[0][i]=1;
        }
        MatrixUtils.printMatrix(matrix);
        for (int rowNo = 1; rowNo <m; rowNo++)
        {
            for (int colNo = 1; colNo <n; colNo++)
            {
                matrix[rowNo][colNo]=matrix[rowNo-1][colNo]+matrix[rowNo][colNo-1];
            }
        }
        MatrixUtils.printMatrix(matrix);
        return Pair.of("O(m*n)", "O(m*n)");
    }

    @Override
    public Pair<String> bestApproach()
    {
        int m = 3, n = 7;
//        from starting position to final position, total steps we take is m-1=2 steps rightwards
//        & n-1=6 steps downwards. Whatever path we choose to final destination these are the
//        steps count we have to take. Total steps=(m-1)+(n-1)=6+2

//        Total No. of ways to reach target=
        //Out of total steps, what are the ways in which we can take right steps=C(total, m-1), here we dont need to think about downward steps bcoz remaining steps are downwards only.
//        or
        //Out of total steps, what are the ways in which we can take downwards steps=C(total, n-1), here we dont need to think about rightward steps bcoz remaining steps are rightward only.
//        NumberUtils.nCr(7, 2);
        int total=(m-1)+(n-1);
        int result=m<n ? NumberUtils.nCr(total, m-1) : NumberUtils.nCr(total, n-1);
        log.info("betterApproach, result={}", result);
        return Pair.of("O(m*n)", "O(m*n)");
    }
}
