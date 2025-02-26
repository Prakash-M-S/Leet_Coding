class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            
            while(!stack.isEmpty()&&heights[i]<=heights[stack.peek()])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                left[i]=stack.peek()+1;
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&heights[i]<=heights[stack.peek()])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                right[i]=stack.peek()-1;
            }
            else
            {
                right[i]=n-1;
            }
            stack.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,(right[i]-left[i]+1)*heights[i]);
        }

        return max;
    }
}