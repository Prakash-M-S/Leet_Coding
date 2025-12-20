class Solution {
    // int dp[][];
    // private int recurse(int i,int j,int[] orig)
    // {
    //     if(i>j)
    //     {
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1)
    //     {
    //         return dp[i][j];
    //     }
    //     int min =Integer.MAX_VALUE;
    //     for(int k =i;k<=j;k++)
    // {
    //     int cost=  orig[j+1]-orig[i-1]+recurse(i,k-1,orig)+recurse(k+1,j,orig);
    //     min = Math.min(cost,min);
    // }
    // dp[i][j]=min;
    // return min;

    // }
    public int minCost(int n, int[] cuts) {
        int c = cuts.length;
        int stick[]=new int[c+2];
        stick[c+1] = n;
        for(int i =0;i<c;i++)
        {
            stick[i+1] = cuts[i];
        }
        int dp[][]=new int[stick.length][stick.length];
        Arrays.sort(stick);
        for(int i=c;i>=1;i--)
        {
            for(int j=1;j<=c;j++)
            {
                if(i>j) continue;
                int min=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++)
                {
                    int cost = (stick[j+1] -stick[i-1])+dp[i][k-1]+dp[k+1][j];
                    min = Math.min(cost,min);
                }
                dp[i][j]=min;
            }
        }
        return dp[1][c];

    }
}