
class Solution {
    class Word{
    String s=" ";
    int step=0;
    Word(String st,int steps)
    {
        s=st;
        step=steps;
    }
}
    // public boolean one(String s1,String s2)
    // {
    //     int diff = 0;
    // for (int i = 0; i < s1.length(); i++) {
    //     if (s1.charAt(i) != s2.charAt(i)) {
    //         diff++;
    //         if (diff > 1) return false;
    //     }
    // }
    // return diff == 1;
    // }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len=wordList.size();
        if(!wordList.contains(endWord)) return 0;
        Queue<Word> que=new LinkedList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String next:wordList)
        {
            for(int i=0;i<beginWord.length();i++)
            {
                String pattern = next.substring(0,i)+'*'+next.substring(i+1);
                map.computeIfAbsent(pattern,k->new ArrayList<>()).add(next);
            }
        }
        Set<String> visited = new HashSet<>();
        que.offer(new Word(beginWord,1));
        visited.add(beginWord);
        while(!que.isEmpty())
        {
            Word curr=que.poll();
            String a=curr.s;
            int b=curr.step;
                for(int i =0 ;i<a.length();i++)
                {
                String pattern=a.substring(0,i)+'*'+a.substring(i+1);
                for(String next:map.getOrDefault(pattern,new ArrayList<>()))
                {
                if(!visited.contains(next))
                {
                    if(next.equals(endWord)) return b+1;
                    visited.add(next);
                    que.offer(new Word(next,b+1));
                }
            }
        }
        }
        return 0;
    }
}