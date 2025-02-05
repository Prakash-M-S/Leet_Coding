class Solution {
    public int orangesRotting(int[][] grid) {
       Queue<int[]> que=new LinkedList<>();
        
        int day=0;
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        boolean check[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if (grid[i][j] == 2) {
                    que.offer(new int[]{i, j});
                    check[i][j] = true;  
                } else if (grid[i][j] == 1) {
                    fresh++;  
                }
                }
            }
            if(fresh==0) return 0;


    
        
        int neighbors[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(!que.isEmpty())
        {
            int size=que.size();
            boolean rotted = false;
            
            for(int i=0;i<size;i++)
            {
                 int[] curr = que.poll(); 
                int row = curr[0], col = curr[1];
            
            for(int nei[]:neighbors)
            {
                int cr=row+nei[0];
                int cc=col+nei[1];
                if(cr<0||cr>=n||cc<0||cc>=m||check[cr][cc]==true||grid[cr][cc]==2||grid[cr][cc]==0)
                {
                    continue;
                }
                grid[cr][cc]=2;
                
                que.offer(new int[]{cr,cc});
                check[cr][cc]=true;
                fresh--;
                rotted=true;
                
            }
            }

            if(rotted)
            {day++;
            }
        }
        return fresh == 0 ? day : -1;

    }
}