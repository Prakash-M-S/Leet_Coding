class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for(char c:expression.toCharArray())
        {
            if(c==',') continue;
            if(c!=')')
            {
                stack.push(c);
            }
            else
            {
                boolean hasT=false;
                boolean hasF=false;
                while(stack.peek()!='(')
                {
                    char v=stack.pop();
                    if(v=='t') hasT=true;
                    if(v=='f') hasF=true;
                }
                stack.pop();
                char ch = stack.pop();
                if(ch=='!')
                {
                    stack.push(hasT?'f':'t');
                }
                else if(ch=='&')
                {
                    stack.push(hasF?'f':'t');
                }
                else
                {
                    stack.push(hasT?'t':'f');
                }
            }
        }
        return stack.pop()=='t';
    }
}