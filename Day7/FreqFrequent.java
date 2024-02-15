package Day7;

import java.util.Arrays;

public class FreqFrequent {
    //Frequency of the Most Frequent Element
    
    public int maxFrequency(int[] nums, int k) {
        int maxFrequency = 0; // Initialize the maximum frequency
        long currentSum = 0; // Initialize the current sum of the subarray elements

        Arrays.sort(nums); // Sort the array in ascending order

        for (int left = 0, right = 0; right < nums.length; ++right) {
            currentSum += nums[right]; // Include the current element in the subarray sum

            // Check if the current subarray violates the condition (sum + k < nums[right] * length)
            while (currentSum + k < (long) nums[right] * (right - left + 1)) {
                currentSum -= nums[left]; // Adjust the subarray sum by removing the leftmost element
                left++; // Move the left pointer to the right
            }

            // Update the maximum frequency based on the current subarray length
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        return maxFrequency;
    }
    public static void main(String[] args) {
        FreqFrequent freqFrequent = new FreqFrequent();

        // Example usage
        int[] nums = {1, 2, 4};
        int k = 5;
        int maxFreq = freqFrequent.maxFrequency(nums, k);
        System.out.println("Max frequency of the most frequent element: " + maxFreq);
    }
}

