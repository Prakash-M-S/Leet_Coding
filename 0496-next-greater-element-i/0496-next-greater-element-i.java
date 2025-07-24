class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        int l1=nums1.length;
        int l2=nums2.length;
        for(int i=l2-1;i>=0;i--)
        {
            int curr=nums2[i];
        while(!stack.isEmpty()&&curr>=stack.peek())
        {
            stack.pop();
        }
        if(!stack.isEmpty())
        {
            map.put(curr,stack.peek());
        }
        stack.push(curr);
        }
        for(int i=0;i<l1;i++)
        {
            Integer val=map.get(nums1[i]);
            if(val!=null)
            {
                nums1[i]=val;
            }
            else
            {
                nums1[i]=-1;
            }
        }
        return nums1;
    }
}