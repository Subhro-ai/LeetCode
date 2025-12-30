/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start

import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i : candies) {
            if(i > max) max = i;
        }
        List<Boolean> res = new ArrayList<>();
        for(int candy : candies) {
            if(candy+extraCandies >= max) res.add(true);
            else res.add(false);
        }
        return res;


    }
}
// @lc code=end

