class Solution {
    int dp[];
    boolean pal[][];
    // private int recurse(int i,String s,int n)
    // {
    //     if(i>=n)
    //     {
    //         return 0;
    //     }
    //     if(dp[i]!=-1)
    //     {
    //         return dp[i];
    //     }
        // String temp="";
        // int minCost = Integer.MAX_VALUE;
        // for(int j =i;j<n;j++)
        // {
        //     temp+=s.charAt(j);
        //     int cost= 0;

        //     if(pal[i][j])
        //     {
        //         cost = 1+recurse(j+1,s,n);
        //         minCost = Math.min(minCost,cost);
        //     }
        // }
        // dp[i]=minCost;
    //     return minCost;
    // }
    public int minCut(String s) {
        int N =s.length();
        dp=new int[N+1];
        pal = new boolean[N][N];
        for(int i =N-1;i>=0;i--)
        {
            for(int j=i;j<N;j++)
            {
                if(i==j)
                {
                    pal[i][j]=true;
                }
                else if(j==i+1)
                {
                    pal[i][j]=(s.charAt(i)==s.charAt(j));
                }
                else
                {
                    pal[i][j]=(s.charAt(i)==s.charAt(j) && pal[i+1][j-1]);
                }
            }
        }
        for(int i =N-1;i>=0;i--)
        {
        int minCost = Integer.MAX_VALUE;
        for(int j =i;j<N;j++)
        {
            int cost= 0;

            if(pal[i][j])
            {
                cost = 1+dp[j+1];
                minCost = Math.min(minCost,cost);
            }
        }
        dp[i]=minCost;
        }
        return dp[0]-1;
        // return recurse(0,s,N) -1;
    }
}