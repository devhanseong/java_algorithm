package baekjoon.hashtable;

import java.util.*;

public class TwoSumHashTable {

    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 7, 5, 3, 16};
        int target = 14;
        boolean result = twoSum(arr, target);
        System.out.println(result);
    }

    private static boolean twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer value : arr) {
            if (map.containsKey(target - value)) {
                return true;
            } else {
                map.put(value, 0);
            }
        }
        return false;
    }

}
