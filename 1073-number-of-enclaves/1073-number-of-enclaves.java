class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<int[]> que=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;


        for(int i=0;i<n;i++)
        {
            if(grid[0][i]==1) que.offer(new int[]{0,i});
            if(grid[m-1][i]==1) que.offer(new int[]{m-1,i});
        }
        for(int i=1;i<m-1;i++)
        {
            if(grid[i][0]==1) que.offer(new int[]{i,0});
            if(grid[i][n-1]==1) que.offer(new int[]{i,n-1});
        }
        int dirr[][]={{1,0},{-1,0},{0,-1},{0,1}};
        while(!que.isEmpty())
        {
            int curr[]=que.poll();
            int r=curr[0];
            int c=curr[1];
    grid[r][c]=0;
            for(int arr[]:dirr)
            {
                int nr=arr[0]+r;
                int nc=c+arr[1];
                if(nr>=0&&nc>=0&&nr<m&&nc<n&&grid[nr][nc]!=0)
                {
                    grid[nr][nc]=0;
                    que.offer(new int[]{nr,nc});
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}