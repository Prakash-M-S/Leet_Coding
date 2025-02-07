class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max_length=0;
        int sum=0;
        map.put(0,-1);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sum+=(arr[i]==0)?-1:1;
            if(map.containsKey(sum))
            {
                max_length=Math.max(max_length,i-map.get(sum));
            }
            else
            {
                map.put(sum,i);
            }
        }
        return max_length;
    }
}

