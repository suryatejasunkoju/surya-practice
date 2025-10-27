package com.practise.surya_practise.DSA.StriversSdeSheet.day3.arrays_part_3;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PowOfXN implements DsaSolutionInterface
{

    @Override
    public Pair<String> bruteForce() {
        double base= 2.00000, result=1, infinity=-1;
        int exponent=10;
        if(base==1.0)
        {
           result=base;
        }
        else if(base!=0 && exponent==0){
            result=1;
        }
        else if(base==0 && exponent>0){
            result=0;
        }
        else if(base==0 && exponent<=0){
            result=infinity;
        }


//        cases:
//        base exponent
//        >0  >0
//        >0  =0 -> 1
//        >0  <0

//        =0  =0 -> infinity
//        =0  >0 -> 0
//        =0  <0 -> infinity

//        <0  >0
//        <0  <0
//        <0  =0 -> 1

        log.info("bruteForce, result={}", result);
        return null;
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
