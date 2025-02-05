class Solution {
    int direction[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int island=0;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                island++;
                dfs(n,m,grid,i,j);
                }
            }
            
        }
        return island;
    }
    private void dfs(int n,int m,char grid[][],int row,int col)
    {
        grid[row][col]='0';
        for(int i =0;i<4;i++)
        {
            int cr=row+direction[i][0];
            int cc=col+direction[i][1];
            if(cr<0||cr>=n||cc<0||cc>=m||grid[cr][cc]=='0')
            {
                continue;
            }
            dfs(n,m,grid,cr,cc);
        }

    }
}