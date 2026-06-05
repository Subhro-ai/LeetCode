/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start

import java.util.Deque;

class Solution {
    public void rotate(int[] nums, int k) {
        int[] rotated = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rotated[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(rotated, 0, nums, 0, nums.length);
    }
}
// @lc code=end

