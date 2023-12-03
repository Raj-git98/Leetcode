package com.learning.ds;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 7, 8, 10, 12, 15};
        int[] arr2 = {5, 8, 11, 12, 14, 15};
        symDiff(arr1, arr2);

// Call to Roman to Integer Conversion
        RomanToInteger rti = new RomanToInteger();
        int result = rti.romanToInteger("MIV");
        System.out.println("Equivalent Integer value " + result);

// Call to AddTwoNumbers
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(6);

        AddTwoNumber addTwoNumber = new AddTwoNumber();

// calling LongestCommmonPrefix
        String[] strs = {"raj", "rajshekar", "rajshekarMattikop"};

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println("LCP " + lcp.longestCommonPrefix(strs));

// calling validParenthisis
        ValidParthensis validString = new ValidParthensis();
        System.out.println(validString.validParenthisis("()[]{}"));

// calling LongestSubString

        DnaSequence ds = new DnaSequence();
        ds.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAA");

        //---------------------------------------------Sliding Window-------------------------------------------------------------


        SlindingWindow dI = new SlindingWindow();
        int arr[] = {1, 0, 1, 1};
        int k = 1;
        // System.out.println(dI.containsNearbyDuplicate(arr, k));
        // System.out.println("Sliding Window : Max Average " +dI.findMaxAverage(new int[]{1, 2, 3, 4, 5},2));
        // System.out.println("Sliding Window : k-beauty number is "+dI.divisorSubstrings(350, 2));
        //   System.out.println("Sliding Window : minimum-size-subarray-sum "+dI.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
        //  System.out.println("Longest SubString Length "+dI.longestSubstring("aabbccdef", 2));
//        System.out.println("Maximum of Occurence " + dI.charCounting("aaabccdddd"));


        Recurrsion rr = new Recurrsion();
//        System.out.println("String Planidrome "+rr.isPalindrome("KayaK"));
//        String s = "A man, a plan, a canal: Panama";
//        System.out.println("Is Planidrome "+rr.palindromString(s));
//        String result1 = "";
//        System.out.println("Is Planidrome "+rr.decimalToBinary(239, result1));
//        System.out.println("Sum of n natural numbers "+rr.sumOfNaturalNumbers(4));

        SeventyFiveBlind sfb = new SeventyFiveBlind();
//        System.out.println("Alternatively Merged "+sfb.reverseVowels("leetcode"));
//        System.out.println("Reversed String "+sfb.reverseWords("the sky is blue"));
       // System.out.println(" Product  "+sfb.productExceptSelf(new int[]{1,2,3,4}));
        System.out.println("Water Container "+sfb.maxArea(new int []{1,8,6,2,5,4,8,3,7}));

    }

    public static void symDiff(int[]... values) {
        int n = values.length;
        System.out.println(n);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}