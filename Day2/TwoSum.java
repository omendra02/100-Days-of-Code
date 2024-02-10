package Day2;

public class TwoSum {
    
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j}; //return the target index
                    }
                }
            }
            return new int[]{}; //return no value 
        }

        public static void main(String[] args) {
            TwoSum twoSum = new TwoSum();
    
            int[] nums = {2, 7, 11, 15};
            int target = 9;
    
            int[] result = twoSum.twoSum(nums, target);
    
            if (result.length == 2) {
                System.out.println("Indices of the two numbers that add up to target:");
                System.out.println("Index 1: " + result[0]);
                System.out.println("Index 2: " + result[1]);
            } else {
                System.out.println("No two elements found that add up to the target.");
            }
        }
    }

