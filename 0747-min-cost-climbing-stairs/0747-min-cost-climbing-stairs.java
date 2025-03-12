class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    int Dp(int cost[],int i)
    {
        if(i>=cost.length)
        {
            return 0;

        }
        if(map.containsKey(i))
        {
            return map.get(i);
        }
        int res=cost[i]+Math.min(Dp(cost,i+1),Dp(cost,i+2));
        map.put(i,res);
        return res;

    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==0)
        {
            return 0;
        }
        return Math.min(Dp(cost,0),Dp(cost,1));
    }
}