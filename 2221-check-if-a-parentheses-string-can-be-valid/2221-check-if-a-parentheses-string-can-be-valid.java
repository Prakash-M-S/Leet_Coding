import java.util.*;
class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
      if(n%2!=0||n<2)
      {
        return false;
      }  
      for(int i=0;i<n;i++)
      {
        if(locked.charAt(i)=='0')
        {
            stack1.push(i);
        }
        else if(s.charAt(i)=='(')
        {
            stack2.push(i);
        }
        else if(s.charAt(i)==')')
        {
            if(!stack2.empty())
            {
                stack2.pop();
            }
            else if(!stack1.empty())
            {
                stack1.pop();
            }
            else
            {
                return false;
            }
        }

      }
      while(!stack1.empty()&&!stack2.empty()&&stack1.peek()>stack2.peek())
      {
        stack1.pop();
        stack2.pop();
      }
      if(!stack2.empty())
      {
        return false;
      }
      return true;
      

    }
}