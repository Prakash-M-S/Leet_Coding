class Solution {
    private List<Integer>[] build(int nums[],int start,int n)
    {
        List<Integer>[] ans = new ArrayList[n+1];
        for(int i=0;i<=n;i++)    ans[i]=new ArrayList<>();

        for(int mask =0;mask<(1<<n);mask++)
        {
            int cnt=0;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                if((mask&(1<<i))!=0)
                {
                    cnt++;
                    sum+=nums[i+start];
                }
            }
            ans[cnt].add(sum);
        }
        return ans;

    }
    public int minimumDifference(int[] nums) {
        int n =nums.length/2;
        int T=0;
        for(int a:nums) T+=a;
        List<Integer>[] left=build(nums,0,n);
        List<Integer>[] right = build(nums,n,n);
        for(int i =0;i<=n;i++)
{
    Collections.sort(right[i]);
}
int ans = Integer.MAX_VALUE;
for(int k=0;k<=n;k++)
{
    List<Integer> R=right[n-k];
    for(int x:left[k])
    {
        int target = (T/2)-x;
        int pos = Collections.binarySearch(R,target);
        if(pos<0) pos=-pos-1;
        if(pos<R.size())
        {
            int y=R.get(pos);
            ans =Math.min(ans,Math.abs(T-2*(x+y)));
        }
        if(pos>0)
        {
            int y=R.get(pos-1);
            ans =Math.min(ans,Math.abs(T-2*(x+y)));
        }
    }
}
return ans;
}
}