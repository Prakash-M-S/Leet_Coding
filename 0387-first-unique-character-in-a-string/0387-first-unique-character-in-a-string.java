class Solution {
    public int firstUniqChar(String s) {
       LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
       for(char c:s.toCharArray())
       {
        map.put(c,map.getOrDefault(c,0)+1);
       } 
       for(char ch:map.keySet())
       {
        if(map.get(ch)==1)
        {
            return s.indexOf(ch);
        }
       }
       return -1;
    }
}