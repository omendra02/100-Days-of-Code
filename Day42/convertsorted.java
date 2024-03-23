package Day42;



public class convertsorted {
    
  //Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new TreeNode();
        }
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int leftBound, int rightBound) {
        if (leftBound > rightBound) {
            return null;
        }
        int pivot = leftBound + (rightBound - leftBound) / 2;
        TreeNode node = new TreeNode(nums[pivot]);
        node.left = helper(nums, leftBound, pivot - 1);
        node.right = helper(nums, pivot + 1, rightBound);
        return node;
    }
}
}
