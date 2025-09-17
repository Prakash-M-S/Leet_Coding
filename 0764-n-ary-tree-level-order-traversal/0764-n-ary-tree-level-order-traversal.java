/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        while(!que.isEmpty())
        {
            int size=que.size();
            List<Integer> l =new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node curr=que.poll();
                l.add(curr.val);
                for(int j=0;j<curr.children.size();j++)
                {
                    que.offer(curr.children.get(j));
                }
                
            }
            list.add(l);
        }
        return list;
    }
}