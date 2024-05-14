package Day8393;
import java.util.*;
public class Q3 {
    class Solution {
        public int maxProductDifference(int[] nums) {
            Arrays.sort(nums);
            int sz = nums.length;
            //picking pairs greedily
            return (nums[sz-1] * nums[sz - 2]) - (nums[0] * nums[1]);
        }
    } 
}
