package com.practise.surya_practise.DSA;

import java.util.TreeSet;

public class UglyNumber2
{
        //    https://leetcode.com/problems/ugly-number-ii/description/
        public static void nthUglyNumber(int n)
        {

            int count=1, nthUglyNumber=0;
            if(n==1){
                nthUglyNumber=1;
            }
            else {

                TreeSet<Integer> sortedSet = new TreeSet<>();
                sortedSet.add(1);

                while(count<n){
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
        }
}
