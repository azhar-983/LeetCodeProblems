package com.lc.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*

# We have a list/array of scores of students. We want to find all 2 students whose sum of score is equal to a given target.
# Scores = [21,14,10,50]
# Target sum - 64

Map - {21,0} - check for 43.
      {14,1} -check for 50
      {10,2} - check for 54
      {50,3}    - check for 14

# Result - [[1,3]] - indices

# Eg 2- [2,3,5,7,9,4,7,5]
# Target sum = 12
# Result = [[1,4] , [2,3], [2,6]]

Map{} - [2,0] - check for 10
        [3,1] - check for 9
        [5,2] - check for 7
         - check for 5 [2,3]
        [9,4] - check for 3 [1,4]
        [4,5] - check for 8
        [7,[6,3]] - check for 5 -- [[2,3],[1,4],[2,6]]
        [5,[2,7]] - check for 7 -- [[2,3],[1,4],[2,6],[3,7]]

*/
public class TwoSumWithRepeated {
    public static void main(String[] args) {
        List<int[]> result = getTwoSumIndexes(new int[]{1,2,3,4,5}, 5);
        result.stream().forEach(System.out::println);
    }

    public static List<int[]> getTwoSumIndexes(int[] arr, int s) {
        if (arr.length == 0)
            return null;
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> res = new ArrayList<>();
        /*for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(s - arr[i])) {
                List<Integer> tuple = new ArrayList<>();

                tuple.add(map.get(s-arr[i]));
                tuple.add(i);
                res.add(tuple);
            }
            map.put(arr[i], i);
            System.out.println(map.get(arr[i]));
        }*/
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(s - arr[i])) {
                int[] tuple = new int[2];

                tuple[0] = map.get(s-arr[i]);
                tuple[1] = i;
                res.add(tuple);
            }
            map.put(arr[i], i);
            //System.out.println(map.get(arr[i]));
        }
        return res;
    }
}
