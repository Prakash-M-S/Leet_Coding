class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;

        int low = 1;
        int high = x;
        int ans=1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared > x) {
                high = mid-1;
            } else {
                ans=Math.max(mid,ans);
                low = mid+1;
            }
        }
        return ans;
    }
}
