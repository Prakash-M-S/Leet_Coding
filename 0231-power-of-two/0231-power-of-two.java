class Solution {
    public boolean isPowerOfTwo(int n) {
        long num=n;//this is for a edge case of -2^31
       if(num==0) return false;
       return (num&(num-1))==0;
     
    }
}