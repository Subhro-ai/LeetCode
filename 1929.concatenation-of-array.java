/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        // System.out.println(ans.length);
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
// @lc code=end

