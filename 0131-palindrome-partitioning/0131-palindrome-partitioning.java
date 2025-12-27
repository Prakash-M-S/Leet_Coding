class Solution {
    boolean pal[][];
    List<List<String>> res;
    private void recurse(int i,String s,int n,List<String> l)
    {
        if(i>=n)
        {
            res.add(new ArrayList<>(l));
            return;
        }
        int minCost = Integer.MAX_VALUE;
        for(int j =i;j<n;j++)
        {

            if(pal[i][j])
            {
                l.add(s.substring(i, j + 1));
                recurse(j+1,s,n,l);
                l.remove(l.size()-1);
            }
        }
        return;
    }
    public List<List<String>> partition(String s) {
        int N =s.length();
        pal = new boolean[N][N];
        res = new LinkedList<>();
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
        
        recurse(0,s,N,new ArrayList<>());
        return res;
    }
}