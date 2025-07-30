class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i = 0;i<numCourses;i++)
        {
            list.add(new ArrayList<>());
        }
        int[] deg=new int[numCourses];
        for(int course[]:prerequisites)
        {
            int u=course[0];
            int v=course[1];
            list.get(v).add(u);
            deg[u]++;
        }
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(deg[i]==0)
            {
                que.add(i);
            }
        }
        while(!que.isEmpty())
        {
            int node=que.poll();
            System.out.println(node);
            for(int a:list.get(node))
            {
                
                deg[a]--;
                if(deg[a]==0)
                {
                    que.offer(a);
                }
            }
        }

        for(int i:deg)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }
}