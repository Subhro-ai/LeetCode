/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letter = new int[26];
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            letter[s.charAt(i) - 'a']++;
            letter[t.charAt(i) - 'a']--;
        }
        for (int i : letter) {
            if(i!=0) return false;
        }
        return true;
    }
}
// @lc code=end

