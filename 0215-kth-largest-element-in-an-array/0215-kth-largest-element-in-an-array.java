class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que=new PriorityQueue(Collections.reverseOrder());
        int result=0;
        for(int i:nums)
        {
            que.add(i);
        }
        for(int i=0;i<k;i++)
        {
                result=que.poll();
        }
   return result; }

}