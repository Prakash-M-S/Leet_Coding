class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int m =p.length();
        int star=-1;
        int index=-1;
        while(i<n)
        {
            if(j < m&&(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'))
            {
                i++;
                j++;
            }
            else if(j < m && p.charAt(j)=='*')
            {
                star=j;
                index=i;
                j++;
            }
            else if(star!=-1)
            {
                j=star+1;
                index++;
                i=index;
            }
            else
            {
                return false;
            }

        }
        while(j<m&&p.charAt(j)=='*')
        {
            j++;
        }
        return j==m;
    }
}