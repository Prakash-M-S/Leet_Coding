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
    private void dfs(TreeNode node, List<Integer> lis,int curr)
    {
        if(node==null) return;
        if(node.left==null&&node.right==null) lis.add(curr*10+node.val);
        if(node.left!=null)
            dfs(node.left,lis,curr*10+node.val);
        if(node.right!=null) dfs(node.right,lis,curr*10+node.val);

    }
    public int sumNumbers(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res,0);
        int sum=0;
        for(int a:res)
        {
            sum+=a;
        }
        return sum;
    }
}