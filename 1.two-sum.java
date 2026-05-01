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
            int needed = target - nums[i];
            if(map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
            else {
                map.put(needed, i);
            } 
        }
        return new int[]{};
    }
        
}
// @lc code=end

