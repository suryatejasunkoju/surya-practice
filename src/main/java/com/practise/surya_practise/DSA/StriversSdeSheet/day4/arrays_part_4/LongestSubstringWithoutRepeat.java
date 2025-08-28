package com.practise.surya_practise.DSA.StriversSdeSheet.day4.arrays_part_4;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class LongestSubstringWithoutRepeat implements DsaSolutionInterface
{
//    https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    @Override
    public Pair<String> bruteForce() {
        String inputStr="bbbbb";
        String resultStr=null;
        int longestSubStrLength=0;
        boolean isResultFound=false;
        int length = inputStr.length();
        for (int subStrLength = length; subStrLength>=1; subStrLength--)
        {
            log.info("subStrLength={}", subStrLength);
            for (int startIdx = 0; startIdx+subStrLength<=length; startIdx++)
            {
                Map<Character, Integer> freqMap = new HashMap<>(subStrLength);
                log.info("substring={}", inputStr.substring(startIdx, startIdx+subStrLength));
                boolean isFreqMoreThanOne=false;
                for (int i = startIdx; i < startIdx+subStrLength; i++)
                {
                    char charAt = inputStr.charAt(i);
                    if(freqMap.containsKey(charAt))
                    {
                        isFreqMoreThanOne=true;
                        break;
                    }
                    else {
                        freqMap.put(charAt, 1);
                    }
                }
                if(!isFreqMoreThanOne)
                {
                    resultStr=inputStr.substring(startIdx, startIdx+subStrLength);
                    longestSubStrLength=subStrLength;
                    isResultFound=true;
                    break;
                }
            }
            if(isResultFound)
            {
                break;
            }
        }
        log.info("resultStr={}, longestSubStrLength={}", resultStr, longestSubStrLength);
        return null;
    }

    @Override
    public Pair<String> goodApproach()
    {
        String inputStr="bbbbb";
        String resultStr=null;
        int longestSubStrLength=inputStr.isEmpty() ? 0 : 1;
        boolean isResultFound=false;
        int inputStrLength = inputStr.length();
        Map<Character, Integer> freqMap = new HashMap<>(inputStrLength);
        int maxFreq=0;
        for (int i = 0; i < inputStrLength; i++)
        {
            char charAt = inputStr.charAt(i);
            int freq = freqMap.getOrDefault(charAt, 0) + 1;
            maxFreq = Math.max(freq, maxFreq);
            freqMap.put(charAt, freq);
        }
        //observation:non repeating substring inputStrLength<=(inputStrLength-maxFreq+1)
        if(maxFreq==1){
            longestSubStrLength=inputStrLength;
        }
        else
        {
            int maxPossibleLength=inputStrLength-maxFreq+1;
            freqMap = new HashMap<>(inputStrLength);
            for (int subStrLength = maxPossibleLength; subStrLength>1; subStrLength--)
            {
                log.info("subStrLength={}", subStrLength);
                for (int startIdx = 0; startIdx+subStrLength<=inputStrLength; startIdx++)
                {
                    if(startIdx==0)
                    {
                        for (int i = 0; i < startIdx+subStrLength; i++)
                        {
                            char charAt = inputStr.charAt(i);
                            int freq = freqMap.getOrDefault(charAt, 0) + 1;
                            freqMap.put(charAt, freq);
                        }
                    }
                    else
                    {
                        char prevChar = inputStr.charAt(startIdx - 1);
                        Integer prevCharFreq = freqMap.get(prevChar);
                        freqMap.put(prevChar, prevCharFreq-1);
                    }
//                    log.info("substring={}", inputStr.substring(startIdx, startIdx+subStrLength));
                    boolean isFreqMoreThanOne=false;
                    if(!isFreqMoreThanOne)
                    {
                        resultStr=inputStr.substring(startIdx, startIdx+subStrLength);
                        longestSubStrLength=subStrLength;
                        isResultFound=true;
                        break;
                    }
                }
                if(isResultFound)
                {
                    break;
                }
            }
        }

        log.info("resultStr={}, longestSubStrLength={}", resultStr, longestSubStrLength);
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
