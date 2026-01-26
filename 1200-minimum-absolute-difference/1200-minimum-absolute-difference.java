class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int l=0;
        int n=arr.length;
        int r=n-1;
            int min=Integer.MAX_VALUE;
            for(int i=1;i<n;i++)
            {
                int curr=arr[i]-arr[i-1];
                if(curr<min) min=curr;
            }
            List<List<Integer>> res=new ArrayList<>();
            for(int i=1;i<n;i++)
            {
                int c=arr[i]-arr[i-1];
                if(c==min)
                {
                    res.add(new ArrayList<>(Arrays.asList(arr[i-1],arr[i])));
                }
            }
            return res;

    }
}