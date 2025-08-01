class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int diff[][]={{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> que=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0){
                    grid[i][j]=0;
                    que.offer(new int[]{i,j});
                }
                else
                {
                    grid[i][j]=-1;
                }
            }
        }
        while(!que.isEmpty())
        {
            int[] temp=que.poll();
            int r=temp[0];
            int c=temp[1];
            int val=grid[r][c];
            for(int[] nei:diff)
            {
                int nr=r+nei[0];
                int nc=c+nei[1];
                if(nr>=0&&nc>=0&&nr<m&&nc<n&&grid[nr][nc]==-1)
                {
                    grid[nr][nc]=val+1;
                    que.offer(new int[]{nr,nc});
                }
                
            }
            
        }
        return grid;
    }
}