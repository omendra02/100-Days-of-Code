package Day17;

public class ConcatenationArray {
   
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n]; // Create a new array with double the length of nums
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i]; // Concatenate nums with itself
            }
            return ans;
        }
    }
    

