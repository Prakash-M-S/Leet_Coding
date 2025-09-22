class Solution {
    static int houses[];
    int house(int nums[],int n,int position)
    {
        if(position>=n)
        {
            return 0;
        }
        if(houses[position]!=-1)
        {
            return houses[position];
        }
        int take=nums[position]+house(nums,n,position+2);
         int not_take=0+house(nums,n,position+1);
         houses[position]=Math.max(take,not_take);
         return houses[position];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        houses=new int[n];
        Arrays.fill(houses,-1);
        return house(nums,n,0);
    }
}