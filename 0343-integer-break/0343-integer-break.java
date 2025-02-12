class Solution {
    static int max=Integer.MIN_VALUE;

    public int integerBreak(int n) {
    if(n==2)return 1;
    if(n==3)return 2;
    int quo=n/3;
    int rem=n%3;
    if(rem==0){
        rem=1;
    }
    else if(rem==1){
        quo-=1;
        rem=4;
    }
    return (int)(Math.pow(3,quo)*rem);
        
    }
}