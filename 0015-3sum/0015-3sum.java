import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int a=nums[i];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i+1;j<n;j++)
            {
                int b=0-nums[j]-a;
                if(map.containsKey(b))
                {
                        List<Integer> list=Arrays.asList(a,nums[j],b);
                        Collections.sort(list);
                        set.add(list);
                }
                else
                {
                    map.put(nums[j],j);
                }
                    }

                }
      return new ArrayList<>(set);  
    }
}