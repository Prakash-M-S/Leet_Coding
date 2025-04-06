class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        int arr[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            arr[s.charAt(i)-'a']=i;
        }
        int size=0;
        int end=0;
        for(int i=0;i<n;i++)
        {
            if(arr[s.charAt(i)-'a']>end)
            {
                end=arr[s.charAt(i)-'a'];
            }
            size++;
            if(i==end)
            {
                list.add(size);
                size=0;
            }
            

        }
        return list;
    }
}