class Solution {
    public int myAtoi(String s) {
        int neg=1;
        int result=0;
        int i=0;
        int n=s.length();
        for(i=0;i<n&&s.charAt(i)==' ';i++);
        if (i < n && s.charAt(i) == '-') {
            neg = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            neg = 1;
            i++;
        }
        for(;i<n;i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                if (result > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10) {
                    return neg == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                result=result*10+(s.charAt(i)-'0');
            }
            else
            {
                break;
            }
            
        }
        result=result*neg;

        return result;
    }
}