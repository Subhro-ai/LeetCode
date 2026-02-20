/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        for(int i = 0, j = 0; i < s.length() && j < t.length(); j++){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(i == s.length()){
                return true;
            }
        }
        return s.length() == 0;
    }
}
// @lc code=end

