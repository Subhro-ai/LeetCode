
import java.util.Collections;

/*
 * @lc app=leetcode id=3074 lang=java
 *
 * [3074] Apple Redistribution into Boxes
 */

// @lc code=start
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(apple);
        Arrays.sort(capacity, Collections.reverseOrder());
        for (int i = 0; i < apple.length; i++) {
            for (int j = 0; j < capacity.length; j++) {
                if(apple[i] < capacity[i]){
                capacity[i] -= apple[i];
                apple[i] = 0;
                continue;
                }
            }
            
        }
    }
}
// @lc code=end

