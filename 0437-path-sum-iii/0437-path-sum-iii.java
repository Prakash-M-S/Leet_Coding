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
    public int pathSum(TreeNode root, int targetSum) {
         HashMap<Long, Integer> map=new HashMap<>();
        map.put(0L,1);
        return dfs(root,0,map,targetSum);
        
        
    }
    int dfs(TreeNode root,long currSum,HashMap<Long,Integer> map,int k)
    {
        if(root==null)
        {
            return 0;
        }
        currSum+=root.val;
        int count=map.getOrDefault(currSum-k,0);
        
        map.put(currSum,map.getOrDefault(currSum,0)+1);
        count+=dfs(root.left,currSum,map,k);
        count+=dfs(root.right,currSum,map,k);
        map.put(currSum,map.get(currSum)-1);
        return count;
    }
}