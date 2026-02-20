/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
<<<<<<< HEAD

import java.util.ArrayDeque;

class Solution {
    public String reverseWords(String s) {
        Deque<String> stack = new ArrayDeque<>();
        String word;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if( c == ' ' ) continue;
            else {
                
            }
        }
=======
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
>>>>>>> refs/remotes/origin/main
    }
}
// @lc code=end

