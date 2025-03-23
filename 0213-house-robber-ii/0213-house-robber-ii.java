class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1)
        {
            return arr[0];
        }
        if(n==2)
        {
            return Math.max(arr[0],arr[1]);
        }
        int first = helper(arr,0,n-1);
        int second = helper(arr,1,n);
        return Math.max(first,second);
    }
    public int helper(int[] arr,int start,int end)
    {
        int p2=0;
        int p1=0;
        for(int i=start;i<end;i++)
        {
            int curr=Math.max(p1,arr[i]+p2);
            p2=p1;
            p1=curr;
        }
        return p1;
    }
}