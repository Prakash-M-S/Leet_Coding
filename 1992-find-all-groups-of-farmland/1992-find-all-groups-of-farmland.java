class Solution {
    public int[][] findFarmland(int[][] land) {
        int m=land.length;
        int n=land[0].length;
        Queue<int[]> q=new LinkedList<>();
        List<List<Integer>> l=new ArrayList<>();
        int direc[][]={{0,-1},{0,1},{1,0},{-1,0}};
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(land[i][j]==1&&vis[i][j]==false)
                {
                    vis[i][j]=true;
                    List<Integer> lis=new ArrayList<>();
                    lis.add(i);lis.add(j);
                    int a=-1;
                    int b=-1;
                    q.add(new int[]{i,j});
                    while(!q.isEmpty())
                    {

                        int[] curr=q.poll();
                        int r=curr[0];int c=curr[1];
                        a=r;b=c;
                        vis[r][c]=true;
                        for(int nei[]:direc)
                        {
                            int nr=nei[0]+r;int nc=nei[1]+c;
                            if(nr<0||nr>=m||nc<0||nc>=n||vis[nr][nc]||land[nr][nc]==0) continue;
                            q.add(new int[]{nr,nc});
                            vis[nr][nc]=true;
                        }
                    }
                    lis.add(a);lis.add(b);
                    l.add(lis);
                }
            }
        }
        int res[][]=new int[l.size()][4];
        for(int i=0;i<l.size();i++)
        {
            res[i][0]=l.get(i).get(0);
            res[i][1]=l.get(i).get(1);
            res[i][2]=l.get(i).get(2);
            res[i][3]=l.get(i).get(3);

        }
        return res;
    }
}