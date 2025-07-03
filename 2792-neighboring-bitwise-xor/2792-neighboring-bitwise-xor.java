class Solution {
    public boolean doesValidArrayExist(int[] derived) {
            int f=0;
            int l=0;
            for(int n:derived)
            {
                if(n==1)
                {
                    l=~l;
                }
            }


            return f==l;
    }
}