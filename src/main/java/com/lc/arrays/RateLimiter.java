package com.lc.arrays;

import java.util.*;

public class RateLimiter {
    public static void main(String[] args) {
        long[] timestamps = {1600040547954L, 1600040547957L, 1600040547958L};
        String[] ipAddresses = {"127.105.232.211", "127.105.232.211","127.105.232.211"};
        int limit=1;
        int window=3;
        int[] result = solution(timestamps,ipAddresses,limit,window);
        Arrays.stream(result).forEach(System.out::println);
    }
    static int[] solution(long[] timestamps, String[] ipAddresses, int limit, int window) {
        int[] result = new int[timestamps.length];
        Map<String, List<Long>> ipAddresMap = new HashMap<>();
        for(int i=0; i<timestamps.length; i++){
            if(ipAddresMap.containsKey(ipAddresses[i])){
                long difference= timestamps[i]-ipAddresMap.get(ipAddresses[i]).get(0);
                if(ipAddresMap.get(ipAddresses[i]).size()==limit && difference>=window){
                    result[i] = 0;
                }
            }
            List<Long> newList = ipAddresMap.get(ipAddresses[i]);
            if(newList == null)
                newList = new ArrayList<>();
            newList.add(timestamps[i]);
            ipAddresMap.put(ipAddresses[i],newList);
            result[i]=1;
        }
        return result;
    }
}
