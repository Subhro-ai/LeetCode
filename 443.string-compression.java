/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < chars.length){
            int j = i;
            while(j<chars.length && chars[j] == chars[i]){
                j++;
            }
            sb.append(chars[i]);
            if(j - i > 1){
                sb.append(j - i);
            }
            i = j;
        }
        for(i = 0; i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
// @lc code=end

