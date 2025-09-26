class Solution {
    // static int houses[];
    // int house(int nums[],int n,int position)
    // {
    //     if(position>=n)
    //     {
    //         return 0;
    //     }
    //     if(houses[position]!=-1)
    //     {
    //         return houses[position];
    //     }
    //     int take=nums[position]+house(nums,n,position+2);
    //      int not_take=0+house(nums,n,position+1);
    //      houses[position]=Math.max(take,not_take);
    //      return houses[position];
    // }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] houses=new int[n];
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return nums[0];
        }
        houses[0]=nums[0];
        houses[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            houses[i]=Math.max(nums[i]+houses[i-2],houses[i-1]);
        }
        return Math.max(houses[n-1],houses[n-2]);
    }
}