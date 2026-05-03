/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        HashSet<Integer> set= new HashSet<>();
        for(int right= 0; right < nums.length; right++) {
            if(!set.contains(nums[right])) {
                set.add(nums[right]);
                nums[left++] = nums[right];
            }
        }
        return left;
    }
}
// @lc code=end

