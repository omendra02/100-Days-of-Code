package Day6;

public class MaxConsecutiveOnes {
    
        public int findMaxConsecutiveOnes(int[] nums)
        {
            // Initialize variables to track the maximum count and current count of consecutive 1s
            int maxCount=0;
            int curCount=0;
    
            // Iterate through each element in the array
            for(int element: nums)
            {
                if(element==0)
                {
            //reset curCount and maxCount whenever 0 is encountered.
                    if(maxCount<curCount)
                    {
                        maxCount=curCount;
                    }
                    curCount=0;                
                }
                else
                {
                    curCount++;
                }
            }
            // After the loop, compare the final current count with the maximum count and return the larger value
            return maxCount>curCount? maxCount:curCount;
            
        }
        public static void main(String[] args) {
            // Example usage:
            int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
            MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
            int maxConsecutiveOnes = obj.findMaxConsecutiveOnes(nums);
            System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
        }
    }
