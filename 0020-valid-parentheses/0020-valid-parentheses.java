class Solution {
    public boolean isValid(String s1) {
        if(s1.length()==1)
        {
            return false;
        }
      HashMap<Character,Character> map=new HashMap<>();
      map.put(')','(');
      map.put('}','{');  
      map.put(']','[');  
      Stack<Character> s=new Stack<>();
      for(int i=0;i<s1.length();i++)
      {
        char c=s1.charAt(i);
        if(c=='('||c=='['||c=='{')
        {
            s.push(c);
        }
        else
        {
            if(s.empty())
            {
                return false;
            }
            if(map.get(c)==s.peek())
            {
                s.pop();
            }
            else
            {
                s.push(c);
            }
        }
      }
      if(s.empty()) return true;
      else return false;    
    }
}