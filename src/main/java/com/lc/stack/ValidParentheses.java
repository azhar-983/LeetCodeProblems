package com.lc.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String input = "(){{}";
        boolean res = isValid(input);
        System.out.println(res);
    }
    public static boolean isValid(String s) {

        Map<Character, Character> symbolMap = new HashMap<>();
        symbolMap.put(')','(');
        symbolMap.put('}','{');
        symbolMap.put(']','[');

        Stack<Character> symbolsStack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                symbolsStack.push(c);
                continue;
            }
            if(symbolsStack.size()==0 || symbolMap.get(c)!=symbolsStack.pop())
                return false;
        }
        return symbolsStack.isEmpty();
    }
}
