package Day7583;

import java.util.HashSet;

public class Q2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k) hs.remove(nums[i-k-1]);
            if(hs.contains(nums[i])) return true;
            hs.add(nums[i]);
        }
        return false;
    }

}
