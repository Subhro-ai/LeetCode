/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");

        // System.out.println(words.length);
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i > 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}
// @lc code=end

