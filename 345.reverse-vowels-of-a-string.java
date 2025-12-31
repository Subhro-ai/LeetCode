
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
        char[] res = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(right >= left) {
            if (!isVowel(res[left])) {
            left++;
        } else if (!isVowel(res[right])) {
            right--;
        } else {
            char temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }   
        }
        return new String(res);
    }

    public static boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
    }
}
// @lc code=end

