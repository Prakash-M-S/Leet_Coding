class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n =nums.length;
        PriorityQueue<int[]> que=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0])
            {
                return a[1]-b[1];
            }
            return b[0]-a[0];
        });
        for(int i =0;i<k-1;i++)
        {
            que.offer(new int[]{nums[i],i});
        }
        int res[]=new int[n-k+1];
        int idx=0;
        for(int i=k-1;i<n;i++)
        {
            que.offer(new int[]{nums[i],i});
            while(que.peek()[1]<=i-k)
            {
                que.poll();
            }
            res[idx++]=que.peek()[0];
        }
        return res;
    }
}