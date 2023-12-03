package com.learning.ds;

public class Recurrsion {


    public String reverseString(String temp) {
        if(temp.isEmpty()) return "";
        return reverseString(temp.substring(1))+temp.charAt(0);
    }
    public boolean palindromString(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return isPalindrome(s);
    }
    public boolean isPalindrome(String s){
        if(s.length()==0 || s.length()==1) return  true;
        int len = s.length();
        if(s.charAt(0)==s.charAt(len-1)) {
            return isPalindrome(s.substring(1,len-1));
        }
        return false;
    }

    public String decimalToBinary(int decimal, String binary){
        if( decimal == 0 ) return binary;

        binary = decimal%2 + binary;
        return decimalToBinary(decimal/2,binary);
    }

    public int sumOfNaturalNumbers(int n){
        if(n==0) return  0;
        if(n==1) return  1;
        int sum =0;
        sum = n + sumOfNaturalNumbers(n-1);
        return sum;
    }

    public int[] runningSum(int[] nums) {
        for(int i =0 ; i< nums.length; i++){
            if(i == 0) nums[i] = nums[i];
            else {
                nums[i] = nums[i] + nums[i - 1];
            }
        }
        return nums;

    }


    public boolean increasingTriplet(int[] nums) {
        int count =0;
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int i : nums) {
            if(i<=small){
                small = i;
            }
            if(small<i && i <mid){
                mid = i ;
            }
            if(small< mid && mid < i){
                return true;
            }
        }
        return false;
    }

}
