package com.learning.ds;

import java.util.*;

public class SeventyFiveBlind {
 //   -------------------------ARRAYS && STRINGS ----------------
 public String mergeAlternately(String word1, String word2) {
    int l1 = word1.length();
    int l2 = word2.length();
    int i = 0;
    StringBuilder stringBuilder = new StringBuilder();
    while (l1>0 || l2>0){
        if(l1>0) {
            stringBuilder.append(word1.charAt(i));
            l1--;
        }
        if(l2>0) {
            stringBuilder.append(word2.charAt(i));
            l2--;
        }
        i++;
    }

    return stringBuilder.toString();
 }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int n = gcd(str1.length(),str2.length());

        return str1.substring(0,n);
    }

    private int gcd(int length, int length1) {
        if(length1 == 0){
            return length;
        }
        return gcd(length1,length%length1);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> ans = new ArrayList<>();
     int max = 0;
        for(int i = 0; i<candies.length; i++){
            max = Math.max(candies[i],max);
        }

     for(int i = 0; i<candies.length; i++){
         if(candies[i]+extraCandies>=max) {
             ans.add(true);
         }
         else {
             ans.add(false);
         }
     }
     return ans;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count =0;
        for(int i =0 ; i < len; i++){
            if(flowerbed[i]==0){
                boolean left = (i==0)||(flowerbed[i-1]==0);
                boolean right = (i==len-1)||(flowerbed[i+1]==0);

                if(left && right) {
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        if(n<=count) return true;
        return false;
    }


    public String reverseVowels(String s) {
        char [] chars = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            if(isVowel(chars[i])){
                if(isVowel(chars[j])){
                    swap(chars,i,j);
                    i++;
                    j--;
                }
                else {
                    j--;
                }
            }
            else{
                i++;
            }

        }
        return new String(chars);
    }
    public boolean isVowel(char e){
        if(e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u' ) return  true;
        else if(e == 'A' || e == 'E' || e == 'I' || e == 'O' || e == 'U' ) return  true;
        return false;
    }
    private void swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    public String reverseWords(String s) {
        String [] strings = s.trim().split(" ");
        int i =0;
        int j =strings.length-1;
        StringBuilder stringBuilder = new StringBuilder();

        while (i<j){
            swapString(strings,i,j);
            i++;
            j--;
        }
        for (int k = 0 ; k<strings.length; k++) {
            if((k==strings.length-1))stringBuilder.append(strings[k]);
            stringBuilder.append(strings[k]+ " ");

        }
        return stringBuilder.toString();
    }
    private void swapString(String[] word, int start, int end){
        String temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }
 //       Arrays.fill(ans, 1);
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        for (int i: pre) {
            System.out.println("Prefix "+i);
        }
        for (int i: suff) {
            System.out.println("Suffix "+i);
        }
        return ans;
    }

   // --------------------------------------* TWO POINTERS *---------------------------------------------

    public void moveZeroes(int[] nums) {
     int[] result = new int[nums.length];
     int i = 0 ;
     for(int j = 0; j< nums.length; j++){
         if(!(nums[j] == 0)){
             nums[i] = nums[j];
             i++;
         }
     }
       for(int k = i+1 ; k< nums.length ; k++ ){
           nums[k] = 0;
       }

    }


    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i==j;
    }

    public int maxArea(int[] height) {
        int size = height.length;
        int i = 0;
        int j = size -1;
        int maxArea = Integer.MIN_VALUE;
//        for(int i = 0; i< size-1; i++){
//            int h= Math.min(height[i], height[j]);
//            System.out.println("Area value for iteration "+i+" "+(h*j));
//            maxArea = Math.max(maxArea,h*j);
//            j--;
//        }
        while (i<j){
            int h= Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea,h*j);
            j--;
        }

        return  maxArea;
    }
}


