import java.util.*;
class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0; 
        int[] maxl = new int[n];
        int[] maxr = new int[n];
        maxl[0] = 0; 
        for (int i = 1; i < n; i++) {
            maxl[i] = Math.max(maxl[i - 1], arr[i - 1]);
        }
        maxr[n - 1] = 0; 
        for (int i = n - 2; i >= 0; i--) {
            maxr[i] = Math.max(maxr[i + 1], arr[i + 1]);
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int val=Math.min(maxl[i],maxr[i])-arr[i];
            if(val<0) val=0;
sum+=val;
        }
        return sum;

    }
}