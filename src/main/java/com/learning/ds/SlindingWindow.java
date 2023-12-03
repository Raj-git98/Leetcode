package com.learning.ds;

import java.util.*;

public class SlindingWindow {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> intSet = new HashSet<>();

        for (int i =0 ; i<nums.length; i++){
            if(!intSet.add(nums[i])){
                return true;
            }
            else{
                if(i>=k){
                    intSet.remove(nums[i-k]);
                }
            }
        }
        return false;
    }

    // -------------------------------------- ----------------------------------------------------
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        double avg = 0;
        for(int i=0; i<k; i++)
            sum+=nums[i];
        avg = sum;

        for(int j=k; j< nums.length; j++){
            sum+=nums[j]-nums[j-k];
            avg = Math.max(avg, sum);
        }

        double ans = avg/k;
        return ans;
    }


    // -------------------------------------- ----------------------------------------------------
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int subNum = 0;
        int count = 0;
        for(int i = 0; i+k <= s.length(); i++ ){

            subNum = Integer.parseInt(s.substring(i,i+k));
            System.out.println("Subray " +s.substring(i,i+k));
            if(subNum>0 && num%subNum == 0){
                System.out.println("Subray subNum " +subNum);
                count++;
            }
        }
        return count;
    }

//    -------------------**************MIN SIZE SUBRARRAY LENGHT *************-------------------

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int l = 0;

        for(int r =0; r<nums.length; r++ ){
            sum+=nums[r];

            while(sum>=target){
                min = Math.min(min,r-l+1);
                sum-=nums[l++];

            }
        }
        return  min == Integer.MAX_VALUE? 0 : min;
    }


    // -------------------------------------- LONGEST SUBSTRING WITH ATLEAST K REPEATING----------------------------------------

    public int longestSubstring(String s, int k) {
        int count[] = new int[26];
        char ch[]=s.toCharArray();
        int start = 0;
        int max = 0;
        boolean valid = true;
        for(int i =0 ; i<s.length(); i++){
            count[s.charAt(i)-'a'] = count[s.charAt(i) - 'a']+1;
        }

        for(int i = 0 ; i<s.length() ; i++){
            if(count[s.charAt(i)-'a']>0 && count[s.charAt(i)-'a']<k){
                String subString = s.substring(start, i );
                max = Math.max(max, longestSubstring(subString, k));
                start = i+1;
                valid = false;
            }
        }
        if(valid){
            return s.length();
        }else{
            return Math.max(max,longestSubstring(s.substring(start), k));
        }

    }

    // -------------------------------------- CHARACTER COUNTING  ----------------------------------------

    public int charCounting(String s){

        char[] ch = s.toCharArray();
        int count[]= new int[256];
        int max = 0;
        for(char c : ch){
            count[c]--;
        }
        for(int i=0; i<count.length; i++){
            max = Math.max(max, count[i]);
        }
        System.out.println("Count Array "+count['a']);
        return max;
    }


}



