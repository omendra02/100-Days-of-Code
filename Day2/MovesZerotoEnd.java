package Day2;

public class MovesZerotoEnd {
    
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

       
         while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        MovesZerotoEnd movesZeroes = new MovesZerotoEnd();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Original array:");
        printArray(nums);

        movesZeroes.moveZeroes(nums);

        System.out.println("Array after moving zeroes to the end:");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
