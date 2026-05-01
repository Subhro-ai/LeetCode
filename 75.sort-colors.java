/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int l = 0, i = 0, r = nums.length - 1;
        while(i <= r){
            if(nums[i] == 0) {
                swap(nums, i, l);
                i++;
                l++;
            } else if(nums[i] == 1) {
                i++;
            } else if(nums[i] == 2){
                swap(nums, r, i);
                r--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

