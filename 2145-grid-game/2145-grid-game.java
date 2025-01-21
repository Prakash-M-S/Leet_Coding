import java.util.*;
class Solution {
    public long gridGame(int[][] grid) {
        int n=grid[0].length;
        long prefix1[]=new long[n];
        prefix1[0]=grid[0][0];
        long prefix2[]=new long[n];
        prefix2[0]=grid[1][0];
        for(int i=1;i<n;i++)
        {
            prefix1[i]=prefix1[i-1]+grid[0][i];
            prefix2[i]=prefix2[i-1]+grid[1][i];

        }
        long robot=Long.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            long top_remaining=prefix1[n-1]-prefix1[i];
            long bottom_remaining=i>0?prefix2[i-1]:0;
            long robot_2=Math.max(top_remaining,bottom_remaining);
            robot=Math.min(robot,robot_2);

        }
        return robot;
    }
}