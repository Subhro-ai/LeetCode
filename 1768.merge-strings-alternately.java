/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int max = Math.max(word1.length(), word2.length());
        for(int i = 0; i < max; i++) {
            if(word1.length() > i) {
                s.append(word1.charAt(i));
            }
            if(word2.length() > i) {
                s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }
}
// @lc code=end

