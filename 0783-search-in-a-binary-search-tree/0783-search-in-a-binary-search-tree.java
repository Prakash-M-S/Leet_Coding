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
    private TreeNode what=null;
    public TreeNode searchBST(TreeNode root, int val) {
        what=search(root,val);
        return what;
        
    }
    TreeNode search(TreeNode root,int val)
    {
        if(root==null)
        {
            return null;
        }
        if(root.val==val)
        {
            return root;
        }
        else if(root.val>val)
        {
            return search(root.left,val);
        }
        else if(root.val<val)
        {
            return search(root.right,val);
        }
        return null;
    }
}