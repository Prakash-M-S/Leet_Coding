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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        que.offer(root);
        while(!que.isEmpty())
        {
            int size=que.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=que.poll();
                if(i==size-1)
                {
                    list.add(curr.val);
                }
                if(curr.left!=null)
                {
                que.offer(curr.left);
                }
                if(curr.right!=null)
                {
                que.offer(curr.right);
            
                }}
        }
        return list;
    }
}