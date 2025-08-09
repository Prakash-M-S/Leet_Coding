class word{
    String s=" ";
    int step=0;
    word(String st,int steps)
    {
        s=st;
        step=steps;
    }
}
class Solution {
    public boolean one(String s1,String s2)
    {
        int diff = 0;
    for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
            diff++;
            if (diff > 1) return false;
        }
    }
    return diff == 1;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len=wordList.size();
        if(!wordList.contains(endWord)) return 0;
        boolean visited[]=new boolean[len];
        Queue<word> que=new LinkedList<>();
        que.offer(new word(beginWord,1));
        while(!que.isEmpty())
        {
            word curr=que.poll();
            String a=curr.s;
            int b=curr.step;
            for(int i=0;i<len;i++)
            {
                if(!visited[i]&&one(a,wordList.get(i)))
                {
                    if(wordList.get(i).equals(endWord)) return b+1;
                    visited[i]=true;
                    que.offer(new word(wordList.get(i),b+1));
                }
            }
        }
        return 0;
    }
}