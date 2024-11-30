class Solution {
    public boolean isAnagram(String s, String t) {
        int anagram[]=new int[26];
        for(char c:s.toCharArray())
        {
            anagram[c-'a']++;
        }
        for(char c:t.toCharArray())
        {
            anagram[c-'a']--;
        }
        for(int a:anagram)
        {
            if(a!=0)
            {
                return false;
            }
        }

    return true;
    }
}