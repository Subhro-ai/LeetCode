
import java.util.ArrayList;
import java.util.Deque;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        StringBuilder v = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(isVowel(c)){
                stack.push(c);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(isVowel(c)) {
                v.append(stack.pop());
            } else {
                v.append(c);
            }
        }
        return v.toString();
    }

    public static boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
}
}
// @lc code=end

