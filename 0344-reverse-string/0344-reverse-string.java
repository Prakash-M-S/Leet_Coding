class Solution {
    void Recursion(char[] s,int i,int n)
    {
        if(i>=n/2)
        {
            return;
        }
        int end=n-i-1;
        char temp=s[i];
        s[i]=s[end];
        s[end]=temp;
        Recursion(s,i+1,n);
    }
    public void reverseString(char[] s) {
        
        int n=s.length;
        if(n<1)
        {
            return;
        }
        Recursion(s,0,n);
    }
}