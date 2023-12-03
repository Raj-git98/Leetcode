package com.learning.ds;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int longestSubString(String s){
        HashSet<Character> hs = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;

        while(end<s.length()){
            if(hs.add(s.charAt(end))){
                end++;
                maxLength=Math.max(maxLength,hs.size());
            }
            else{
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
