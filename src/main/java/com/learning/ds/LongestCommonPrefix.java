package com.learning.ds;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){

        StringBuilder longestCommonPrefix = new StringBuilder();

        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }

        int minLengthString = strs[0].length();

        for(int i = 0 ; i<strs.length ; i++){
            minLengthString = Math.min(minLengthString, strs[i].length());
        }

        for(int i=0; i<minLengthString; i++){
            char current = strs[0].charAt(i);
            for(String str : strs){
                if(str.charAt(i)!=current){
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }
}
