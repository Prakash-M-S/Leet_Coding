class Solution {
    int dp[][];
    public int recurse(int i ,int j,char s1[],char s2[],int n , int m)
    {
        if(i==n||j==m)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
       {
        return dp[i][j];
       }
        if(s1[i]==s2[j])
        {
            dp[i][j]=1+recurse(i+1,j+1,s1,s2,n,m);
            return dp[i][j];
        }
       
        dp[i][j]=Math.max(recurse(i+1,j,s1,s2,n,m),recurse(i,j+1,s1,s2,n,m));
        return dp[i][j];
        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        char s1[]=text1.toCharArray();
        char s2[]=text2.toCharArray();
        int n=s1.length;
        int m=s2.length;
        dp=new int[n][m];
        for(int arr[]:dp)
        {
            Arrays.fill(arr,-1);
        }
        return recurse(0,0,s1,s2,n,m);
    }
}