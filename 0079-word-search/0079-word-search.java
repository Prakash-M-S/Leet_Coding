class Solution {
    public boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
    
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(dfs(R,C,0,board,word,i,j))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    boolean dfs(int R,int C,int count,char[][] board, String word,int i,int j)
    {
        if (count == word.length()) {
            return true;  
        }
        
        if(i<0||i>=R||j<0||j>=C||board[i][j]!=word.charAt(count))
        {
            return false;
        }
        char temp=board[i][j];
        board[i][j]='#';
        
        boolean result=dfs(R,C,count+1,board,word,i+1,j)
        ||dfs(R,C,count+1,board,word,i,j+1)
        ||dfs(R,C,count+1,board,word,i,j-1)
        ||dfs(R,C,count+1,board,word,i-1,j);
        board[i][j]=temp;
        return result;
    }
}