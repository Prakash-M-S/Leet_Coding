class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int a=0;
        int b=0;
        int n=numbers.length;
        int r=n-1;
        while(l<r)
        {
            if(numbers[l]+numbers[r]<target)
            {
                l++;
            }
            else if(numbers[l]+numbers[r]>target)
            {
                r--;
            }
            else
            {
                a=l+1;
                b=1+r;
                break;
            }

        }
        return new int[] {a,b};
    }
}