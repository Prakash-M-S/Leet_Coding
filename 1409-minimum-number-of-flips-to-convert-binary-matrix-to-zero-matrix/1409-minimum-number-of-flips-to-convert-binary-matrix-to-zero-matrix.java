class Solution {
    public int minFlips(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int start = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                start |= (mat[i][j] << (i * n + j));
            }
        }
        Queue<Integer> que=new LinkedList<>();
        que.add(start);
        int steps=0;
        Set<Integer> visited=new HashSet<>();
        visited.add(start);
        int count=0;
        int[][] diff= {{0,0},{1,0},{-1,0},{0,1},{0,-1}};
        while(!que.isEmpty())
        {
            int qsize=que.size();
            for(int counter=1;counter<=qsize;counter++)
            {
                int cstate=que.poll();
                if(cstate==0)
                {
                    return steps;
                }
                for(int row=0;row<m;row++)
                {
                    for(int col=0;col<n;col++)
                    {
                        int next=cstate;
                        for(int[] dir:diff)
                        {
                            int nr=row+dir[0];
                            int nc=col+dir[1];
                            if(nr>=0&&nc>=0&&nr<m&&nc<n)
                            {
                                next^=(1<<(nr*n+nc));
                            }
                        }
                        if(!visited.contains(next))
                        {
                            visited.add(next);
                            que.add(next);
                        }                 }
                }

            }
            steps++;
        }
        
    return -1;

    }
}