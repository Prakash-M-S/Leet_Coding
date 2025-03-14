/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean rec(TreeNode temp,Integer min,Integer max)
    {
        if(temp==null)
        {
            return true;
        }
        if((min!=null&&temp.val<=min)||(max!=null&&temp.val>=max))
        {
            return false;
        }
        return rec(temp.right,temp.val,max)&&rec(temp.left,min,temp.val);
    }
    public boolean isValidBST(TreeNode root) {
        return rec(root,null,null);
    }
}