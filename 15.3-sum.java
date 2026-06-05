/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0, right = nums.length -1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum > 0) right--;
            else if(sum < 0) left++;
            else {
                result.add(Arrays.asList(nums[left], nums[right]));
                left++;
                right--;
            }
        }
        return result;
    }
}
// @lc code=end

