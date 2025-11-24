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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int flag=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            int arr[]=new int[size];
            for(int i =0;i<size;i++)
            {
                TreeNode temp=q.poll();
                int ind=flag==0?i:size-i-1;
                arr[ind]=temp.val;
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
            }
            flag=flag==0?1:0;
            result.add(Arrays.stream(arr).boxed().toList());
        }
        return result;
    }
}