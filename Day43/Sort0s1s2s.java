package Day43;
import java.util.*;


public class Sort0s1s2s {
    
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 1, 2, 1, 0));
        int n = arr.size();
        sortArray(arr, n);
        System.out.println(arr);
    }
}
}


