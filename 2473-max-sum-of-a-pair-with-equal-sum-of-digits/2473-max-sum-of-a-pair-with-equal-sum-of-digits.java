class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int max=-1;
        for(int num:nums)
        {
            int digit=sumOfDigits(num);
            if(map.containsKey(digit))
            {
                max=Math.max(max,map.get(digit)+num);
            }
            map.put(digit,Math.max(map.getOrDefault(digit,0),num));
        }
        return max;
        }
        public int sumOfDigits(int n)
        {
            int res=0;
            while(n!=0)
            {
                int d=n%10;
                res+=d;
                n=n/10;
            }
            return res;
        }
}