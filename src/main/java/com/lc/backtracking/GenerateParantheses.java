package com.lc.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(),0,0,n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder cur, int open, int close, int max) {
        if(cur.length()==2*max){
            result.add(cur.toString());
            return;
        }

        if(open<max){
            cur.append("(");
            backtrack(result,cur,open+1,close,max);
            cur.deleteCharAt(cur.length()-1);
        }
        if(close<open){
            cur.append(")");
            backtrack(result,cur,open,close+1,max);
            cur.deleteCharAt(cur.length()-1);
        }
    }


}
