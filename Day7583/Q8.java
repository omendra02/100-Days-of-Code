package Day7583;

public class Q8 {
    
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }
}
}
