class Solution {
    int dp[][];
public int recurse(int ind,int prev,int n,int arr[])
{
if(ind==n)
{
    return 0;
}
if(dp[ind][prev+1]!=-1)
{
    return dp[ind][prev+1];
}
int not_take=0+recurse(ind+1,prev,n,arr);
int take=0;
if(prev==-1||arr[ind]>arr[prev])
{
    take=1+recurse(ind+1,ind,n,arr);
}
dp[ind][prev+1]=Math.max(take,not_take);
return dp[ind][prev+1];
}
    public int lengthOfLIS(int[] nums) {
        
        int n =nums.length;
        dp=new int[n][n+1];
        for(int ar[]:dp)
        {
            Arrays.fill(ar,-1);
        }
        return recurse(0,-1,n,nums);
    }
}