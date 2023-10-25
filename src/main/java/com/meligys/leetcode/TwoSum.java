package com.meligys.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumApproachOne(int[] nums, int target) {

        for (int i = 0; i< nums.length; i++) {

            for (int j = 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{0, 1};
    }


    public static int[] twoSumApproachTwo(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                return new int[]{ map.get(sub), i };
            }
            map.put(nums[i], i);

        }

        throw new IllegalArgumentException("No result found");
    }
}
