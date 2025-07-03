class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n1=words.length;
        int n2=queries.length;
        int prefix[]=new int[n1];
        int a[]=new int[n2];
        prefix[0]=isVowel(words[0]);
        for(int i=1;i<n1;i++)
        {
            prefix[i]=isVowel(words[i])+prefix[i-1];
        }
        int e=0;
        for(int i[]:queries)
        {
            int c=i[0];
            int d=i[1];
            if(c==0)
            {
                a[e]=prefix[d];
                e++;
            }
            else
            {
                a[e]=prefix[d]-prefix[c-1];
                e++;
            }

        }
        return a;
    }
    int isVowel(String s)
    {
        char c[] = {'a', 'e', 'i', 'o', 'u'};
ArrayList<Character> a = new ArrayList<>();
for (char ch : c) {
    a.add(ch);
}
        if(a.contains(s.charAt(0))&&a.contains(s.charAt(s.length()-1)))
        {
            return 1;
        }
        return 0;
    }
}