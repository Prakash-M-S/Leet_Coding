class Solution {
    int Recursion(int i,int j,String s1,String s2,int dp[][])
    {
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            dp[i][j]=Recursion(i-1,j-1,s1,s2,dp);
        }
        else
        {
            dp[i][j]=1+Math.min(Recursion(i-1,j,s1,s2,dp),Math.min(Recursion(i-1,j-1,s1,s2,dp),Recursion(i,j-1,s1,s2,dp)));
        }
        return dp[i][j];
    }
    public int minDistance(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n][m];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return Recursion(n-1,m-1,s1,s2,dp);

    }
}