class Solution {
    Integer dp[][];
    int recurse(int rows,int curr,int r,List<List<Integer>> list)
    {
        if(r>=rows)
        {
            return 0;
        }
        if(dp[r][curr]!=null)
        {
            return dp[r][curr];
        }

        dp[r][curr]=list.get(r).get(curr) + Math.min(recurse(rows,curr,r+1,list),recurse(rows,curr+1,r+1,list));
        return dp[r][curr];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows=triangle.size();
        dp=new Integer [rows][rows];
        return recurse(rows,0,0,triangle);
    }
}