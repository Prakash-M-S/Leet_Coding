class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1;
        int r=Integer.MIN_VALUE;
        for(int p:piles) r=Math.max(r,p);
        while(l<r)
        {
            int m=l+(r-l)/2;
            long hours=0;
            for(int p:piles)
            {
                hours+=(p+m-1)/m;
            }
            if(hours<=h)
            {
                r=m;
            }
            else
            {
                l=m+1;
            }
        }
        return r;
    }
}