class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            int arr[]=new int[26];
            for(char ch:s.toCharArray())
            {
                arr[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int a:arr)
            {
                sb.append(a).append('#');
            }
            String key=sb.toString();
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}