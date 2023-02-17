package com.lc.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair{
    char alphabet;
    int count;
    Pair(char ch, int x){
        this.alphabet = ch;
        this.count = x;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "alphabet=" + alphabet +
                ", count=" + count +
                '}';
    }
}
public class DuplicateCharsWithCount {
    public static void main(String[] args) {
        List<Pair> list = duplicate_char("gsddzvwkykahecjj",4);
        System.out.println(list);
    }
    public static ArrayList<Pair> duplicate_char(String s, int n) {
        ArrayList<Pair> result = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            if(map.get(c)>1){
                Pair p = new Pair(c,map.get(c));
                result.add(p);
            }

        }
        return result;
    }
}
