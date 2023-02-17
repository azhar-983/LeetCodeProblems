package com.lc.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxLengthStrings {
    public static void main(String[] args) {
        String[] input = {"aba","aa","ad","vcd","aba"};
        String[] res = solution(input);
        Arrays.stream(res).forEach(System.out::println);
    }
    static String[] solution(String[] inputArray) {

        List<String> res = new ArrayList<>();
        int maxLength = 0;
        for(String str: inputArray){
            if(str.length()>maxLength)
                maxLength = str.length();
        }

        for(String s : inputArray){
            if(s.length()==maxLength)
                res.add(s);
        }
        String[] ans = res.toArray(new String[res.size()]);

        return ans;
    }

}
