package com.learning.ds;

public class PalindromeCheck {
    public boolean isPalindrome(int x){
        if(palindrome(x)==x){
            return true;
        }
        else{
            return false;
        }
    }

    private int palindrome(int x) {
        int reverse_num=0;
        while(x>0){
            reverse_num=reverse_num*10+x%10;
            x=x/10;
        }
        return reverse_num;
    }
}
