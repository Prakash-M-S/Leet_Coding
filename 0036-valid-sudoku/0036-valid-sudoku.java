class Solution {
    public boolean isValidSudoku(char[][] board) {
     int R = board.length;
     int C = board.length;
     int rowf[]= new int[R];
     int []colf= new int[C];
     int []subarray=new int [R];
     for(int row = 0 ; row< R ;row++ ){
        for(int col =0 ; col < C ; col++){
            if(board[row][col]!='.'){
                int dig= board[row][col]-'0';
                int subdix=3*(row/3)+col/3;
            
            if(((1<<dig)&rowf[row])!=0||((1<<dig)&colf[col])!=0||((1<<dig)&subarray[subdix])!=0)
                return false;
            
            rowf[row]|=(1<<dig);
            colf[col]|=(1<<dig);
            subarray[subdix]|=(1<<dig);
        }
     }   
    
    }
return true;
    }
}