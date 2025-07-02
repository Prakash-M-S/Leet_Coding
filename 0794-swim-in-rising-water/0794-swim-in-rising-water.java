class Solution {
    public int swimInWater(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int ans=0;
      PriorityQueue<int []> heap=new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));  
      heap.add(new int[]{0,0,grid[0][0]});
      boolean visited[][]=new boolean[R][C];
      int direc[][]={{1,0},{-1,0},{0,1},{0,-1}};

      while(!heap.isEmpty())
      {
        int[] temp=heap.poll();
        int x=temp[0];
        int y=temp[1];
        int curr=temp[2];
        ans=Math.max(ans,curr);
        if(x==R-1&&y==C-1) break;
        for(int d[]:direc)
        {
            int nr=x+d[0];
            int nc=y+d[1];
            if(nr<0||nc<0||nr>=R||nc>=C||visited[nr][nc])
            {
                continue;
            }
            visited[nr][nc]=true;
            heap.add(new int[]{nr,nc,grid[nr][nc]});

        }
      }
      return ans;
    }
}