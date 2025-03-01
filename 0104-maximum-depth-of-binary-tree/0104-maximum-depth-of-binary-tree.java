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

    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> que=new LinkedList<>();
        int size=0;
        que.add(root);
        while(!que.isEmpty())
        {
            size++;
            int s=que.size();
            for(int i=0;i<s;i++)
            {
                TreeNode child=que.poll();
                
                if(child.left!=null)
                {
                    que.add(child.left);
                }
                if(child.right!=null)
                {
                    que.add(child.right);
                }
            }

        }
        return size;
        
    }
}