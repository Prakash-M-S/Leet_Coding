class Solution {
    public int[][] transpose(int[][] matrix) {
        int temp=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int a[][]=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i!=j)
                {
                    a[j][i]=matrix[i][j];
                }
                else
                {
                    a[i][j]=matrix[i][j];

                }
            }
        }
    return a;
    }
}