import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            if(i!=0&&nums[i]==nums[i-1])
            {
                continue;
            }
        int l=i+1;
        int r=n-1;
        if (a > 0) {
                break;
            }
        while(l<r)
        {
            if(a+nums[l]+nums[r]<0)
            {
                l++;
            }
            else if(a+nums[l]+nums[r]>0)
            {
                r--;
            }
            else
            {
                list.add(new ArrayList<>(Arrays.asList(a,nums[l],nums[r])));
                l++;
                while(nums[l]==nums[l-1]&&l<r)
                {
                    l++;
                }
            }

        }
                }
    return list;

    }
}