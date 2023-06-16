package com.lc.arrays;

import java.util.*;

public class HighFive {
    public static void main(String[] args) {
        int[][] nums = { {1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        highFive(nums);
    }
    public static int[][] highFive(int[][] items){
            Map<Integer,PriorityQueue<Integer>> map = new TreeMap<>();
            for(int item[] : items){
                int key = item[0];
                int value = item[1];

                if(!map.containsKey(key)){
                    //adding marks to maxheap
                    map.put(key,new PriorityQueue<>((a,b)->b-a));
                }
                map.get(key).add(value);
            }
            int res[][] = new int[map.size()][2];
            int n = 0;

            for(Map.Entry<Integer,PriorityQueue<Integer>> me : map.entrySet()){
                int sum = 0;
                for(int i=0; i<5; i++)
                    sum = sum + me.getValue().poll();

                res[n][0] = me.getKey();
                res[n][1] = sum/5;
                n++;
            }
        System.out.println(res[0][0]+" "+res[0][1]+" "+res[1][0]+" "+res[1][1]);
            return res;
        }

}
