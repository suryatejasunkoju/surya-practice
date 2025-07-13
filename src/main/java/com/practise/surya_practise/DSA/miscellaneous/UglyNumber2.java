package com.practise.surya_practise.DSA.miscellaneous;

import com.practise.surya_practise.DSA.utils.Pair;
import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;

import java.util.TreeSet;

public class UglyNumber2 implements DsaSolutionInterface
{
        //    https://leetcode.com/problems/ugly-number-ii/description/

    @Override
    public Pair<String> bruteForce() {
        int n=10;
        int count=1, nthUglyNumber=0;
        if(n==1){
            nthUglyNumber=1;
        }
        else
        {

            TreeSet<Integer> sortedSet = new TreeSet<>();
            sortedSet.add(1);
            //for n times, we are adding 3 elements[3*[O(log(n))]] & removing 1 element[O(log(n))]
            //=O(n)*4*O(log(n))
            while(count<n)
            {
                Integer first = sortedSet.first();
                sortedSet.add(first*2);
                sortedSet.add(first*3);
                sortedSet.add(first*5);
                sortedSet.remove(first);
                count++;
                System.out.println("sortedSet="+sortedSet);
            }
            System.out.println("nth="+sortedSet.first());
        }
        System.out.println(n + "th ugly number is: " + nthUglyNumber);
        return Pair.of("O(nlog(n))", "O(n)");
    }

    @Override
    public Pair<String> goodApproach()
    {
        return Pair.of("", "");
    }

    @Override
    public Pair<String> betterApproach() {
        return Pair.of("", "");
    }

    @Override
    public Pair<String> bestApproach() {
        return Pair.of("", "");
    }
}
