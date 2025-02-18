/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        if(root==null)
        {
            return "";
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            TreeNode temp=que.poll();
            if(temp==null)
            {
                sb.append("n,");

            }
            else
            {
                que.add(temp.left);
                que.add(temp.right);
                sb.append(temp.val);
                sb.append(",");
            }

        }
        sb.setLength(sb.length()-2);
        return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0||data.charAt(0)=='n')
        {
            return null;
        }
        
        Queue<TreeNode> que=new LinkedList<>();
        String node[]=data.split(",");
        int n=node.length;
        TreeNode root=new TreeNode(Integer.parseInt(node[0]));
        que.add(root);
        
        int i=1;
        System.out.println(Arrays.toString(node));
        while(!que.isEmpty()&&i<n)
        {
            TreeNode temp=que.poll();
            if(!node[i].equals("n"))
            {
                temp.left=new TreeNode(Integer.parseInt(node[i]));
                que.add(temp.left);
            }
            i++;
            if(i<n&&!node[i].equals("n"))
            {
                temp.right=new TreeNode(Integer.parseInt(node[i]));
                que.add(temp.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));