package com.learning.ds;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInteger(String S){
        Map<Character , Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int n = S.length();

        int num = romanMap.get(S.charAt(n-1));

        for(int i = n-2; i>=0; i--){

            if(romanMap.get(S.charAt(i)) >= romanMap.get(S.charAt(i+1))){
                num+= romanMap.get(S.charAt(i));
            }
            else{
                num-= romanMap.get(S.charAt(i));
            }
        }

        return num;
    }
}
