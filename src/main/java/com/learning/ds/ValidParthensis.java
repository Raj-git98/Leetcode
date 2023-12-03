package com.learning.ds;

import java.util.Stack;

public class ValidParthensis {

    public boolean validParenthisis(String s){
        Stack<Character> str = new Stack<>();

        for(char current : s.toCharArray()){

            if(current == '(' || current == '{' || current == '['){
                str.push(current);
            }
            else if(current == ')' && !str.isEmpty() && str.peek() == '('){
                str.pop();
            }
            else if(current == '}' && !str.isEmpty() && str.peek() == '{'){
                str.pop();
            }
            else if(current == ']' && !str.isEmpty() && str.peek() == '['){
                str.pop();
            }
            else {
                return false;
            }
        }
        return str.isEmpty();
    }
}
