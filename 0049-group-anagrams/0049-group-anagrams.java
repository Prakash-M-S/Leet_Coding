class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String s:strs)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sorted=String.valueOf(c);
            if(!m.containsKey(sorted))
            {
                m.put(sorted,new ArrayList<>());
            }
            m.get(sorted).add(s);
        }
        return new ArrayList(m.values());
    }
}