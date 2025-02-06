class Solution {
    public int tupleSameProduct(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
       int prod=1;
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            prod=nums[i]*nums[j]; 
            map.put(prod,map.getOrDefault(prod,0)+1);
        }
       }
        int result=0;
        for(int i:map.values())
        {
            if(i>1)
            {
                result+=((i*(i-1))/2)*8;
            }
        }
        return result;
    }
}