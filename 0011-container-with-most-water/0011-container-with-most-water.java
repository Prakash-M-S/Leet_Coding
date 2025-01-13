import java.util.*;
class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int max=0;
        int l=0;
        int r=n-1;
        while(l<r)
        {
            int a=arr[l];
            int b=arr[r];
            int current=Math.min(arr[l],arr[r])*(r-l);
            max=Math.max(current,max);
            if(a<b) l+=1;
            else r-=1;

            

        }
        return max;
    }
}