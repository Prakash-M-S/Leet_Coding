class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> build=new Stack<>();
        Stack<Integer> num=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int n=0;
        
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                n=n*10+(c-'0');
            }
            else if(c=='[')
            {
                num.push(n);
                build.push(curr);
                curr=new StringBuilder();
                n=0;
            }
            else if(c==']')
            {
                StringBuilder sb=curr;
                curr=build.pop();
                curr.append(sb.toString().repeat(num.pop()));
            }
            else
            {
                curr.append(c);
            }
        }
            return curr.toString();
            
    }
}