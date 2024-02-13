package Day5;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target, int low, int high) {
        // Base case: if low is greater than high, the target is not found
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        
        if (arr[mid] == target) {
            return mid;
        }
     
        //left half
        else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);
        }
        //right half
        else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element is not present in array");
        }
    }
}

