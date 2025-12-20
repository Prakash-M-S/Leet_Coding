class Solution {
    int dp[][];
    private int recurse(int i,int j,int[] orig)
    {
        if(i>j)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int min =Integer.MAX_VALUE;
        for(int k =i;k<=j;k++)
    {
        int cost=  orig[j+1]-orig[i-1]+recurse(i,k-1,orig)+recurse(k+1,j,orig);
        min = Math.min(cost,min);
    }
    dp[i][j]=min;
    return min;

    }
    public int minCost(int n, int[] cuts) {
        int c = cuts.length;
        int stick[]=new int[c+2];
        stick[c+1] = n;
        for(int i =0;i<c;i++)
        {
            stick[i+1] = cuts[i];
        }
        dp=new int[c+1][c+1];
        for(int arr[] : dp)
        {
            Arrays.fill(arr,-1);
        }
        Arrays.sort(stick);
        return recurse(1,c,stick);

    }
}