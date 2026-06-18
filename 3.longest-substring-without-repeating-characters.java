/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        char[] arr = s.toCharArray();
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(arr[i]);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
// @lc code=end

