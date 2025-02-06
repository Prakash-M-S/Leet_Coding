class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int mat[][]=new int[n+1][m+1];
        int max=0;
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(nums1[i-1]==nums2[j-1])
                {
                    mat[i][j]=mat[i-1][j-1]+1;
                    max=Math.max(max,mat[i][j]);
                }
            }
        }
        return max;
    }
}