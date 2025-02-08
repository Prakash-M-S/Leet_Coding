class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int price=0;
        int n1=gas.length;
        int n2=cost.length;
        for(int i=0;i<n1;i++)
        {
            price+=(gas[i]-cost[i]);
        }
        if(price<0)
        {
            return -1;
        }
        price=0;
        int start=0;
        for(int i=0;i<n1;i++)
        {
            price+=(gas[i]-cost[i]);
            if(price<0)
            {
                price=0;
                start=i+1;
            }
        }
        return start;
    }
}