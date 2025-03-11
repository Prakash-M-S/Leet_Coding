class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> min=new LinkedList<>();
        Deque<Integer> max=new LinkedList<>();
        int left=0;

        int maxL=0;
        for(int right=0;right<nums.length;right++)
        {
            
            while(!min.isEmpty()&&nums[right]<min.peekLast())
            {
                min.pollLast();
            }
            min.add(nums[right]);
            while(!max.isEmpty()&&nums[right]>max.peekLast())
            {
                max.pollLast();
            }
            max.add(nums[right]);
            while(!min.isEmpty() && !max.isEmpty() && 
                   Math.abs(max.peekFirst() - min.peekFirst()) > limit)
            {
                
                

            if(!min.isEmpty() && min.peekFirst()==nums[left]) {
                    min.pollFirst();
                }
                
                if(!max.isEmpty() && max.peekFirst()==nums[left]) {
                    max.pollFirst();
                }
                    left++;
            
            }
            if(right-left+1>maxL)
            {
                maxL=right-left+1;
 
            }

        }
        return maxL;
    }
}