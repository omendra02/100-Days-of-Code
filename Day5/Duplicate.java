package Day5;
public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicate du = new Duplicate();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10}; // Example array with duplicate
        if (du.containsDuplicate(nums)) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }
    }
}