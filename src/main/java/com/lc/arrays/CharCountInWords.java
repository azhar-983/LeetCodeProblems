package com.lc.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharCountInWords {
    public static void main(String[] args) {
        int[] res = solution(new int[]{25,2,3,57,38,41});
        Arrays.stream(res).forEach(System.out::println);
    }
    static int[] solution(int[] a) {
        int[] digits_count = new int[10];
        List<Integer> result = new ArrayList<>();
        for(int i:a){
            while(i>0){
                int digit = i%10;
                digits_count[digit]++;
                i = i/10;
            }
        }
        int max_count = 0;
        for(int i=0; i<10; i++){
            if(max_count<digits_count[i])
                max_count = digits_count[i];
        }

        for(int j:digits_count){
            if(j==max_count)
                result.add(j+1);
        }

        return  result.stream().mapToInt(Integer::intValue).toArray();
    }

}
