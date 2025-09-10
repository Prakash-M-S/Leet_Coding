class Solution {
    boolean check(int row,int col,int R,int C,char[][] board)
    {
        for(int j=0;j<C;j++)
        {
            if(j==col)
            {
                continue;
            }
            if(board[row][j]==board[row][col])
            {
                return false;
            }
        }
        for(int j=0;j<R;j++)
        {
            if(j==row)
            {
                continue;
            }
            if(board[j][col]==board[row][col])
            {
                return false;
            }
        }
        int r_temp=(int)row/3;
        int c_temp=(int)col/3;
        r_temp=r_temp>0?r_temp*3:r_temp;
        c_temp=c_temp>0?c_temp*3:c_temp;
        for(int i=r_temp;i<r_temp+3;i++)
        {
            for(int j=c_temp;j<c_temp+3;j++)
            {
                if(i==row&&j==col)
                {
                    continue;
                }
                if(board[i][j]==board[row][col])
                {
                    return false;
                }
            }

        }

        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int R=board.length;
        int C=board[0].length;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(board[i][j]!='.')
                {
                    if(!check(i,j,R,C,board))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}