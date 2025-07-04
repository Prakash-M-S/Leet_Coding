class Solution {
    public static void rev(int a[],int s,int e)

    {
        while(s<e)
        {
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
}