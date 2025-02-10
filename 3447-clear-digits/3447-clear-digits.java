class Solution {
    public String clearDigits(String s) {
        
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
            }
            else
            {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        
        return sb.toString();
    }
}