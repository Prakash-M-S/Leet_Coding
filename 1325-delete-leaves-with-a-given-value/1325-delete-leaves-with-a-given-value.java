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

    public TreeNode removeLeafNodes(TreeNode node, int target) {
        if(node==null) return null;
        if(node.left==null&&node.right==null)
        {
            if(node.val==target)
            {
                return null;
            }
        }
        else{
            if(node.left!=null)
            {
                node.left=removeLeafNodes(node.left,target);
            }
            if(node.right!=null)
            {
                node.right =removeLeafNodes(node.right,target);
            }
            if(node.left==null&&node.right==null)
        {
            if(node.val==target)
            {
                return null;
            }
        }
        }
        return node;
    }
}