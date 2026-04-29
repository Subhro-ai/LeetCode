/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int needed = target - x;
            // System.out.println("needed : " + needed);
            if(map.containsKey(x)) {
                return new int[] {map.get(x), i};
                
            } else {
                map.put(needed, i);
                // System.out.println("Put : " + needed + ":" + i);
            }
        }
        return new int[]{};
    }
}
// @lc code=end

