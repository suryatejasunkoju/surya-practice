package com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class LongestConsecutiveSequence implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce() {
        int[] nums = {100,4,200,1,3,2};
        //sort arr
        //2 pointers: l,r, increase r till the end of consecutive no.s, if end, make l=currIndex
        int len = nums.length;
        Arrays.sort(nums);
        log.info("nums={}", nums);
        int left=0, right=0, longestConsecutiveSequenceLen=1,  currConsecutiveSequenceLen=1;
        for(int i=1; i<len; i++)
        {
            log.info("left={}, right={}, longestConsecutiveSequenceLen={}", left, right, longestConsecutiveSequenceLen);
            if(nums[i-1]+1==nums[i])
            {
                right++;
                currConsecutiveSequenceLen=right-left+1;
                longestConsecutiveSequenceLen=Math.max(currConsecutiveSequenceLen, longestConsecutiveSequenceLen);
            }
            else
            {
                left=i;
                right=i;
            }
        }
        log.info("longestConsecutiveSequenceLen={}", longestConsecutiveSequenceLen);
        return Pair.of("O(nlogn)+O(n)", "O(1)");
    }


    @Override
    public Pair<String> goodApproach() {
        //1.form indexSet & elemPosMap
        //2.take any index from indexSet, lets say x.
        //3.go forward & backward until max sequence possible including this current element x. We will get this sequence len as l1
        //4.While moving forward & backward remove this indexes from set
        //repeat steps 2,3,4 to get all sequences lengths as l2,l3,etc until indexSet becomes empty
        //ans=findMax(l1,l2,l3,...)

        
        int[] nums = {1,0,1,2};
        int len = nums.length, maxSequenceLen=0;
        Set<Integer> indexSet = new HashSet<>();
        Map<Integer, Integer> elemPosMap=new HashMap<>();
        for(int i=0; i<len; i++)
        {
            int curr = nums[i];
            if(!elemPosMap.containsKey(curr)){
                indexSet.add(i);
                elemPosMap.put(curr, i);
            }
        }
        //time till here=O(2n)
        log.info("elemPosMap={}", elemPosMap);
        log.info("indexSet={}", indexSet);
        while(!indexSet.isEmpty())//this will be run no of consecutive sequence times. Which will be less than "n"
        {
            Set<Integer> currSequence=new TreeSet<>();
            Iterator<Integer> iterator = indexSet.iterator();
            if (iterator.hasNext())
            {
                Integer currIdx = iterator.next();
                int currElem = nums[currIdx];
                log.info("currIdx={}, currElem={}", currIdx, currElem);
                int currSequenceLen=1;
                currSequence.add(currElem);
//                go forward & backward until max sequence possible including this currIdx element
                Integer next=currElem+1;
                Integer prev=currElem-1;
                while (elemPosMap.containsKey(prev))
                {
                    //this & below both while loops at max take-O(n) time
                    Integer index = elemPosMap.get(prev);
                    currSequence.add(prev);
                    prev--;
                    currSequenceLen++;
                    indexSet.remove(index);
                }
                while (elemPosMap.containsKey(next))
                {
                    currSequence.add(next);
                    Integer index = elemPosMap.get(next);
                    next++;
                    currSequenceLen++;
                    indexSet.remove(index);
                }
                indexSet.remove(currIdx);
                maxSequenceLen=Math.max(maxSequenceLen, currSequenceLen);
                log.info("maxSequenceLen={}", maxSequenceLen);
                log.info("currSequence={}", currSequence);
            }
        }
        //all elems from indexSet is removed=O(n)
        //total time=O(2n)+O(n)+O(n)+O(<n>)
        log.info("maxSequenceLen={}", maxSequenceLen);
        return Pair.of("O(5n)", "O(2n)"); //my own O(n) approach- buts it time exceeding in leetcode
    }


    @Override
    public Pair<String> betterApproach() {
        int[] nums = {1,0,1,2};
        int len = nums.length, maxSequenceLen=0;
        Set<Integer> elemSet=new HashSet<>();
        for(int i=0; i<len; i++)
        {
            elemSet.add(nums[i]);
        }
        log.info("elemSet={}", elemSet);
        for (int curr : elemSet)
        {
            //for_block
            int prev = curr - 1;
            if(!elemSet.contains(prev))
            {
                //1_block
                //this block will be entered only for elements which are all starts of sequences
                int currSequenceSize = 1;
                int currElem = curr + 1;
                while (elemSet.contains(currElem))
                {
                    currElem++;
                    currSequenceSize++;
                }
                maxSequenceLen=Math.max(maxSequenceLen, currSequenceSize);
            }
        }
        //total time spent in 1_block is atmax O(n)
        //total time spent in for_block is atmax O(n)
        //total time=O(2n)
        //here we skipped, set.remove()s,
        log.info("maxSequenceLen={}", maxSequenceLen);
        return Pair.of("O(2n)", "O(n)");
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }
}
