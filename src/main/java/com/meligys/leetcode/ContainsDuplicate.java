package com.meligys.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate {


    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Boolean> existingList = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (existingList.containsKey(nums[i])) {
                return true;
            }

            existingList.put(nums[i], true);
        }

        return false;
    }
}
