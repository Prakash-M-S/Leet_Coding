class Solution {
    static int dp[][]; 
    public boolean recurse(String s,String p, int i, int j,int n,int m)
    {
        if(i==n&&j==m)
        {
            dp[i][j]=1;
            return true;
        }

        if(j==m)   
        {
            dp[i][j]=0;
            return false;
        }
        if(dp[i][j]!=-1) return dp[i][j]==1?true:false;
        if (i == n) {
        for (int k = j; k < m; k++) {
        if (p.charAt(k) != '*') 
        {
            dp[i][j]=0;
        return false;
        }
    }
    dp[i][j]=1;
    return true;
}
boolean ans=false;
        if(p.charAt(j)=='?'||p.charAt(j)==s.charAt(i))
        {
            ans= recurse(s,p,i+1,j+1,n,m);
        }
        else if(p.charAt(j)=='*')
        {
            ans= recurse(s,p,i+1,j,n,m)||recurse(s,p,i,j+1,n,m);
                
        }
        dp[i][j]=ans?1:0;
        return ans;
    }
    public boolean isMatch(String s, String p) {
        dp=new int[s.length()+1][p.length()+1];
        for(int arr[]:dp)
        {
            Arrays.fill(arr,-1);
        }
        return recurse(s,p,0,0,s.length(),p.length());
    }
}