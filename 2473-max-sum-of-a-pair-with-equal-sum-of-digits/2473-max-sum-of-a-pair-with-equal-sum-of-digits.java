class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int max=-1;
        for(int num:nums)
        {
            int digit=0;
            int temp=num;
            while(num!=0)
            {
                int d=num%10;
                digit+=d;
                num=num/10;
            }

            if(map.containsKey(digit))
            {
                max=Math.max(max,map.get(digit)+temp);
            }
            map.put(digit,Math.max(map.getOrDefault(digit,0),temp));
        }
        return max;
        }
       
}