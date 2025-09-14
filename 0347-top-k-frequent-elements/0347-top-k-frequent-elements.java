class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>[] freq=new List[n+1];
        for(int i=0;i<n+1;i++)
        {
            freq[i]=new ArrayList<>();
        }
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {

            freq[entry.getValue()].add(entry.getKey());
            }
        int result[]=new int[k];
        int index=0;

        for(int i=n;i>=0&&index<k;i--)
        {
            for(int a:freq[i])
            {
                result[index++]=a;
                if(index==k)
                {
                    return result;
                }
            }
        }
        return result;
    }
}