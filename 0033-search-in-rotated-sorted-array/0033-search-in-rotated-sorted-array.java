class Solution {
    private int find(int arr[])
    {
    int n=arr.length;
    if (arr[0] <= arr[n-1]||n<2) 
    {
        return 0;
    }
        int left =0;
        int right= n-1;
        while(left<right)
        {   int mid = left+(right-left)/2;
            if(arr[mid]>arr[right])
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
    private int bs(int arr[],int l,int r,int target)
    {
    int n=arr.length;
    if(n<2)
    {
        return 0;
    }

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
public int search(int arr[], int target) {
        int f=find(arr);
        if(arr[f]==target)
        {
            return f;
        }
        int left=bs(arr,0,f,target);
        int right =bs(arr,f+1,arr.length-1,target);
        if(left!=-1)
        {
            if(arr[left]==target)
            {
                return left;
            }
        }
        else if(right!=-1)
        {
            if(arr[right]==target)
            {
                return right;
            }
        }
        return -1;

    }
}