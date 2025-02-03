class Solution {
    public String removeStars(String s) {
     Stack<Character> stack=new Stack<>();

     StringBuilder sb=new StringBuilder();
     for(char ch:s.toCharArray())
     {
        if(ch=='*'&&sb.length()!=0)
        {
            sb.deleteCharAt(sb.length()-1);
        }
        else{
        sb.append(ch);
        }
     }
     return sb.toString();
    }
}