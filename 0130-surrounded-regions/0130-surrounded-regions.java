class Solution {
    public void solve(char[][] board) {
     int Row=board.length;
     int Col=board[0].length;
     int vis[][] = new int[Row][Col];
     for(int i=0;i<Col;i++)
     {
        if(board[0][i]=='O'&&vis[0][i]!=1)
        {
            dfs(vis,Row,Col,0,i,board);
        }
     }
     for(int i=1;i<Row;i++)
     {
        if(board[i][0]=='O'&&vis[i][0]!=1)
        {
            dfs(vis,Row,Col,i,0,board);
        }}
        for(int i=1;i<Col;i++)
     {
        if(board[Row-1][i]=='O'&&vis[Row-1][i]!=1)
        {
            dfs(vis,Row,Col,Row-1,i,board);
        }
     }
     for(int i=1;i<Row-1;i++)
     {
        if(board[i][Col-1]=='O'&&vis[i][Col-1]!=1)
        {
            dfs(vis,Row,Col,i,Col-1,board);
        }}

     for(int R=0;R<Row;R++)
     {
        for(int C=0;C<Col;C++)
        {
            if(vis[R][C]==0)
            {
                board[R][C]='X';
            }
        }
     }
    }
    int direc[][]={{1,0},{-1,0},{0,1},{0,-1}};
    public void dfs(int[][] vis,int Row,int Col,int R,int C,char[][] board)
    {
        vis[R][C]=1;
        for(int arr[]:direc)
        {
            int nr=R+arr[0];
            int nc=arr[1]+C;
            if(nr<0||nc<0||nr>=Row||nc>=Col||board[nr][nc]=='X'||vis[nr][nc]==1) continue;
            dfs(vis,Row,Col,nr,nc,board);


        }
    }
    }
