class Solution {
    public boolean recursion(int i,String s,Set<String> wordSet,Boolean dp[])
    {
        if(i==s.length()) return true;
        if(dp[i]!=null) return dp[i];
        boolean ways=false;
        for(int k=i;k<s.length();k++)
        {
            if(wordSet.contains(s.substring(i,k+1))&&recursion(k+1,s,wordSet,dp))
            {
                ways=true;
                break;
            }
        }
        return dp[i]=ways;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet=new HashSet<>(wordDict);
        int n=s.length();
        Boolean dp[]=new Boolean[n];
    
        return recursion(0,s,wordSet,dp);
    }
}