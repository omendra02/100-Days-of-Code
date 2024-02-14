package Day6;

public class RemoveElement {

        public int removeElement(int[] nums, int val) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
        public static void main(String[] args) {
            // Example usage:
            int[] nums = {3, 2, 2, 3};
            int val = 3;
            RemoveElement obj = new RemoveElement();
            int newLength = obj.removeElement(nums, val);
            System.out.println("New length of the array after removing element " + val + ": " + newLength);
            System.out.print("Array after removing element " + val + ": [");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i]);
                if (i < newLength - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

