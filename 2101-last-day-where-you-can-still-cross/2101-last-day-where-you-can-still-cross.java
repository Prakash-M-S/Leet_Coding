class Solution {
    private int find(int node,int[] leader)
    {
        if(node==leader[node])
        {
            return node;
        }
        leader[node]=find(leader[node],leader);
        return leader[node];
    }
    public void join(int left,int right,int[] leader){
        leader[find(right,leader)]=leader[find(left,leader)];

    }

    public int getIndex(int R,int C,int row,int col)
    {
        return (col+(row*C)+1);
    }
    public int latestDayToCross(int R, int C, int[][] cells) {
        int leader[]=new int[R*C+2];
        int days=0;
        for(int i=1;i<R*C+2;i++)
        {
            leader[i]=i;
        }
        int[][] diff={{1,0},{-1,0},{0,1},{0,-1},{-1,-1},{1,1},{-1,1},{1,-1}};
        boolean water[][]=new boolean[R][C];
        for(int cell[]:cells)
        {
            int row=cell[0]-1;
            int col = cell[1]-1;
            water[row][col]=true;
            for(int nei[]:diff)
            {
                int nr=row+nei[0];
                int nc=col+nei[1];
                if(nr<0||nc<0||nr>=R||nc>=C)
                {
                    continue;
                }
                if(water[nr][nc])
                {
                    join(getIndex(R,C,nr,nc),getIndex(R,C,row,col),leader);

                }
            }
            if(col==0)
            {
                join(0,getIndex(R,C,row,col),leader);
                
            }
            if(col==C-1) join(R*C+1,getIndex(R,C,row,col),leader);
            if(find(0,leader)==find(R*C+1,leader))
            {
                return days;
            }
            days++;
        }
        return -1;
    }
}