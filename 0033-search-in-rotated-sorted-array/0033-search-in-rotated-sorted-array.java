class Solution {
    private int find(int arr[])
    {
    int n=arr.length;
    if (arr[0] <= arr[n-1]||n<2) 
    {
        return 0;
    }
        int l =0;
        int r= n-1;
        while(l<r)
        {   int mid = l+(r-l)/2;
            if(arr[mid]>arr[r])
            {
                l=mid+1;
            }
            else
            {
                r=mid;
                
            }
        }
        return l;
    }
    private int bs(int arr[],int l,int r,int target)
    {
    int n=arr.length;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
public int search(int nums[], int target) {
        int f=find(nums);
        if (nums.length == 0) return -1;
        if(nums[f]==target)
        {
            return f;
        }
        if (target >= nums[f] && target <= nums[nums.length - 1])
            return bs(nums, f, nums.length - 1, target);
        else
            return bs(nums, 0, f - 1, target);

    }
}