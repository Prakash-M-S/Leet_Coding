class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        int left =0;
        int top=0;
        int bottom=n-1;
        int right=m-1;
        while(left<=right&&top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                l.add(mat[top][i]);

            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                l.add(mat[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    l.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    l.add(mat[i][left]);
                }
                left++;
            }
        }
        return l;
    }
}