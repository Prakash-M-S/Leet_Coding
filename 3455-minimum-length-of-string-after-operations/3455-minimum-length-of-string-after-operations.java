class Solution {
    public int minimumLength(String s) {
   int freq[]=new int[26];
   int n=s.length();
   for(char ch:s.toCharArray())
   {
    freq[ch-'a']++;

   }
   int length=0;
   for(int i:freq)
   {
    if(i==0) continue;
    else if(i%2==0)
    {
        length+=2;
    }
    else
    {
        length+=1;
    }
   }
   return length;
    }
}