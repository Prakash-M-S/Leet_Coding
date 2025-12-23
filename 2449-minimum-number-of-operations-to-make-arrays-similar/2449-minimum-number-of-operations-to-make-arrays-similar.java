class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        List<Integer> e= new ArrayList<>();
        List<Integer> o = new ArrayList<>();
        List<Integer> te=new ArrayList<>();
        List<Integer> to = new ArrayList<>();
        int n =nums.length;
        for(int i =0;i<n;i++)
        {
            if((nums[i]&1)==1)
            {
                o.add(nums[i]);
            }
            else
            {
                e.add(nums[i]);
            }
            if((target[i]&1)==1)
            {
                to.add(target[i]);
            }
            else
            {
                te.add(target[i]);
            }
        }
        Collections.sort(o);
        Collections.sort(e);
        Collections.sort(te);
        Collections.sort(to);
        long operations = 0L;
        for(int i =0;i<o.size();i++)
        {
            operations+=(long)(Math.abs(o.get(i)-to.get(i))/2);
        }
        for(int i =0;i<e.size();i++)
        {
            operations+=(long)(Math.abs(e.get(i)-te.get(i))/2);
        }
        return operations/2;

    }
}