class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board)
    {

    
        for(int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
                if(board[row][col]=='.')
                {
                char arr[]={'1','2','3','4','5','6','7','8','9'};
            
            for(char i:arr)
            {
                    if(is_safe(i,board,row,col))
                    {
                    
                    board[row][col]=i;
                    if(solve(board))
                    {
                        return true;
                    }
                    board[row][col]='.';
                    }
                }
                return false;
            }
        }
    }
    return true;
    }
    public boolean is_safe(int i,char[][] board,int row,int col)
    {
            for(int j=0;j<9;j++)
        {
            if(board[row][j]==i||board[j][col]==i)
            {
                return false;
            }
            
            
        }
            int cr=3*(row/3);
            int cc=3*(col/3);
            for(int j=cr;j<cr+3;j++)
            {
                for(int k=cc;k<cc+3;k++)
                {
                    if(board[j][k]==i)
                    {
                        return false;
                    }
                }

            }
            
        
        return true;
    }
}