package Day6;

import java.util.Arrays;

public class RotateArray {
     
        public void rotate(int[] nums, int k) {
            int[] temp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                temp[(i + k) % nums.length] = nums[i];
            }
            // Copy temp into nums
            System.arraycopy(temp, 0, nums, 0, nums.length);
        }

         public static void main(String[] args) {
        // Example usage:
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray obj = new RotateArray();
        obj.rotate(nums, k);
        System.out.println("Array after rotating by " + k + " steps: " + Arrays.toString(nums));
    }
    }

