class Solution {
    public int square(int n)
    {
        int s=0;
        while(n!=0)
        {
        int d=n%10;
        s+=d*d;
        n=n/10;
        }
        return s;
        
    }
    public boolean isHappy(int n) {

        Set<Integer> map=new HashSet<>();
        while(true)
        {
            n=square(n);
            if(n==1)
            {
                return true;
            }
            else if(map.contains(n))
            {
                return false;
            }
            map.add(n);
        }

            }
}