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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        
        que.add(root);
        while(!que.isEmpty())
        {
            List<Integer> li=new ArrayList<>();
           int size=que.size();
           
           for(int i=0;i<size;i++)
           {
            TreeNode temp=que.poll();
            li.add(temp.val);
           if(temp.left!=null)
           {
            
            que.add(temp.left);
           }
           if(temp.right!=null)
           {
            
            que.add(temp.right);

           }
           }
           list.add(li);
        }
        return list;
    }
}