package com.lc.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        map.put(1,list1);
        map.put(2,list2);
        map.put(3,list3);

        map.get(3).add("hi");
        System.out.println(map);
    }
}
