class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean check[]=new boolean[n+1];
        for(int i:nums)
        {
            check[i]=true;
        }
        int i=0;
        for( i=0;i<n+1;i++)
        {
            if(check[i]==false)
            {
                break;
            }
        }
        return i;

    }
}