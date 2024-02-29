package Day21;

public class SortColor {
    
     
        public void sortColors(int[] nums) {
     
            
            int[] nums1 = new int[3];
     
            
            for (int num : nums) nums1[num]++;
     
            
            int i = 0;
            for (int j = 0; j < 3; j++) {
                while (nums1[j] > 0) {
                    nums[i] = j;
                    nums1[j]--;
                    i++;
                }
            }
        }
    }

