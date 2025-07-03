class Solution {
    public int shortestPathAllKeys(String[] grid) {
        int keys=0;
        int R=grid.length;
        int C=grid[0].length();
        Queue<int []> que=new LinkedList<>();
        
        boolean visited[][][]=new boolean[R][C][64];
         
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                char ch = grid[i].charAt(j);
                if(Character.isLowerCase(ch))
                {
                    keys++;
                }
                else if(ch=='@') {que.add(new int[]{i,j,0,0});
                visited[i][j][0]=true;
                }
            }
        }
        int needed=(int)Math.pow(2,keys);

        
       
       int direc[][]={{1,0},{-1,0},{0,1},{0,-1}};
        while(!que.isEmpty())
        {
            int[] cell=que.poll();
            int row=cell[0],col=cell[1],moves=cell[2],flag=cell[3];
            if(flag==needed-1)
            {
                return moves;
            }
            for(int[] dir:direc)
            {
                int nr=dir[0]+row;
                int nc=dir[1]+col;
                if(nr<0||nc<0||nr>=R||nc>=C||grid[nr].charAt(nc)=='#')
                {
                    continue;
                }
                char ch=grid[nr].charAt(nc);
                if (Character.isUpperCase(ch) && ((flag & (1 << (ch - 'A'))) == 0))

                {
                    continue;
                }
                int new_flag=flag;
                if(Character.isLowerCase(ch))
                {
                    new_flag=new_flag|(1<<(ch-'a'));
                }
                if(!visited[nr][nc][new_flag])
                {
                    que.add(new int[]{nr,nc,moves+1,new_flag});
                    visited[nr][nc][flag]=true;
                }
            }
        }
        return -1;




    }
}