class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
     int n=nums.length;
     int value1=-1;
     int count1=0;
     int value2=-1;
     int count2=0;
     for(int i=0;i<n;i++)
     {
        int b=nums[i];
        if(count1==0&&b!=value2)
        {
            value1=b;
            count1=1;
        }
        else if(count2==0&&b!=value1)
        {
            value2=b;
            count2=1;
        }
        else if(b==value1)
        {
            count1++;
        }
        else if(b==value2)
        {
            count2++;
        }
        else
        {
            count1--;
            count2--;
        }        
     }
     count1=0;
     count2=0;
     for(int i=0;i<n;i++)
     {
        if(nums[i]==value1)
        {
            count1++;
        }
        else if(nums[i]==value2)
        {
            count2++;
        }
     }
    int m=(int)Math.ceil(n/3);
    if(count1>m)
    {list.add(value1);}
    if(count2>m)
    {list.add(value2);}

    return list;   
    }
}