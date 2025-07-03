class Solution {
    public String longestPalindrome(String s) {
        int l=s.length();
        boolean dp[][]=new boolean[l][l];
        int num=0;
        int start=0;
        for(int len=1;len<=l;len++)
        {
            for(int i=0;i<=l-len;i++)
            {
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j))
                {
                    if(len==1||len==2)
                    {
                        dp[i][j]=true;
                    }
                    else{
                        
                            dp[i][j]=dp[i+1][j-1];
                        
                        
                    } 
                    
                    if(dp[i][j]==true){
                     num=Math.max(num,len);
                     start=i;

                }
                
                
            }
        }
        
    }
    System.out.println(num);
    return s.substring(start,start+num);
}
}