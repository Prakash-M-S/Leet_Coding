class Solution {
    int[][] direc={{1,0},{-1,0},{0,1},{0,-1}};
    private void dfs(int[][] grid,int count,int R,int C,int i,int j,int[] island)
    {
        grid[i][j]=count;
        island[count]++;
        for(int nei[]:direc)
        {
            int nr=nei[0]+i;
            int nc=nei[1]+j;
            if(nr<0||nc<0||nr>=R||nc>=C||grid[nr][nc]!=1)
            {
                continue;
            }
            dfs(grid,count,R,C,nr,nc,island);
        }

    }
    public int largestIsland(int[][] grid) {
        int count=2;
        int R=grid.length;
        int C=grid[0].length;
        int island[]=new int[R*C+2];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(grid[i][j]==1)
                {
                    dfs(grid,count++,R,C,i,j,island);
                    
                }
            }
        }
        int max=0;
        boolean zero=false;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {

                if(grid[i][j]==0)
                {
                    zero=true;
                    int total=1;
                    Set<Integer> set=new HashSet<Integer>();
                    for(int[] dir:direc)
                    {
                        int nr=dir[0]+i;
                        int nc=dir[1]+j;
                        if(nr<0||nc<0||nr>=R||nc>=C||grid[nr][nc]<=1)
                        {
                            continue;
                        }
                        int nei=grid[nr][nc];
                        if(set.add(grid[nr][nc]))
                        {
                            total+=island[nei];
                        }
                    }
                
                max=Math.max(max,total);
            }
        }
        }
        
    return zero==true?max:(R*C);

    }
}