import java.util.*;
class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int sum=0;
        if(n==0)
        {
            return sum;
        }
        int left[]=new int[n];
        int right[]=new int[n];
        
        right[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],arr[i+1]);
        }
        left[0]=0;
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],arr[i-1]);
        }
        for(int i=0;i<n;i++)
         {
        int val=Math.min(left[i],right[i])-arr[i];
        if(val<0) val=0;
        
        sum+=val;
        }
    return sum;

    }
}