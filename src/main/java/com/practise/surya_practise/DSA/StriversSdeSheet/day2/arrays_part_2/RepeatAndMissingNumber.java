package com.practise.surya_practise.DSA.StriversSdeSheet.day2.arrays_part_2;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.ArrayUtils;
import com.practise.surya_practise.DSA.utils.NumberUtils;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class RepeatAndMissingNumber implements DsaSolutionInterface {

    public Pair<String> bruteBruteForce()
    {
        int[] arr = {3,1,2,5,3};
        int length = arr.length;
        int A=-1, B=-1;
        Arrays.sort(arr);
        ArrayUtils.printIntArr(arr);
        int oneToNXor=0, arrElementsXor=0;
        for (int i = 0; i < length -1; i++) {
            if(arr[i]==arr[i+1]){
                A=arr[i];
            }
            oneToNXor^=(i+1);
            arrElementsXor^=(arr[i]);
        }
        oneToNXor^= length;
        arrElementsXor^=arr[length -1];
        B=oneToNXor^arrElementsXor^A;
        log.info("bruteBruteForce, A={},B={}", A, B);
        return Pair.of("O(nlogn+n)", "O(1)");
    }
    @Override
    public Pair<String> bruteForce() {
        int[] arr = {3,1,2,5,3};
        int length = arr.length;
        int A=-1, B=-1;

        int[] freq=new int[length];
        for (int i = 0; i < length; i++) {
            int element=arr[i];
            freq[element-1]++;
        }
        ArrayUtils.printIntArr(freq);

        for (int i = 0; i < length; i++) {
            if(freq[i]==2){
                A=i+1;
            }
            else if (freq[i]==0){
                B=i+1;
            }
        }
        log.info("A={},B={}", A, B);
        return Pair.of("O(2n)", "O(n)");
    }

    @Override
    public Pair<String> goodApproach() {
        int[] arr = {3,1,2,5,4,6,7,5};
        Set<Integer> set = new HashSet<>();
        int A=-1, B=-1;
        for (int i = 0; i <arr.length; i++)
        {
            int elem = arr[i];
            boolean contains = set.contains(elem);
            if (!contains){
                set.add(elem);
            }
            else {
                A=elem;
            }
        }
        log.info("set={}", set);
        for (int n = 1; n <=arr.length; n++)
        {
            if (!set.contains(n)){
                B=n;
            }
        }
        log.info("A={},B={}", A,B);
        return Pair.of("O(2n)", "O(n)");
    }

    @Override
    public Pair<String> betterApproach() {
        int[] arr = {3,1,2,5,3};
        //finding point at which loop got created in linked list
        //with hare & tortoise approach

//        int oneToNXor=0, arrElementsXor=0;
//        for (int i = 0; i < arr.length; i++) {
//            oneToNXor^=(i+1);
//            arrElementsXor^=(arr[i]);
//            arr[i]--;
//        }

        ArrayUtils.printIntArr(arr);
        int slow=0, fast=0;
        do
        {
            slow = arr[slow];
            int intermediateFast = arr[fast];
            fast = arr[intermediateFast];
        } while (slow != fast);
        log.info("both pointers meet, start:{}, fast:{}", slow, fast);
        fast=0;
        do {
            slow = arr[slow];
            fast = arr[fast];
        } while (slow != fast);
        log.info("-->slow={}, fast={}", slow, fast);
        return Pair.of("O(2n)", "O(1)");
    }

    @Override
    public Pair<String> bestApproach() {
        int[] arr = {3,1,2,5,3};
        int length = arr.length;
        int A=-1, B=-1; //A=2 times repeated no, B=missing no
        int arrSum=0, arrSquareSum=0;
        for (int i = 0; i < arr.length; i++) {
            arrSum+=arr[i];
            arrSquareSum+=(arr[i]*arr[i]);
        }
        //observations:-
        //1.(sum of 1 to n)+A-B =(arr elements sum)
        // S(1,n)+A-B=arrSum
        // =>A-B=arrSum-S(1,n)=x

        //2.(sum of squares 1 to n)+A^2-B^2 =(arr elements squares' sum)
        //=>S2(1,n)+A^2-B^2=arrSquareSum
        //=>A^2-B^2=arrSquareSum-S2(1,n)=y
        //=>(A+B)(A-B)=y
        //=>A+B=y/(A-B)
        //=>A+B=y/x


        //adding both equations:
        //A-B=x
        //A+B=y/x
        //=========
        //2A=x+y/x
        //A=(x^2+y)/2*x

        //finding B:
        //A-B=x
        //B=A-x

        int sum1ToN = NumberUtils.consecutiveNosSum(1, length);
        int sumOfSquares1ToN = NumberUtils.consecutiveNosSquaresSum(1,length);
        int intermediateResult = arrSquareSum - sum1ToN;
        int x=arrSum-sum1ToN, y=arrSquareSum-sumOfSquares1ToN;
        A=(x*x+y)/2*x;
        B=A-x;
        log.info("bestApproach, A={},B={}", A,B);
        return null;
    }
}
