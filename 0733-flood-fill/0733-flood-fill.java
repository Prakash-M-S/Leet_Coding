class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> que=new LinkedList<>();
        que.offer(new int[]{sr,sc});
        int m=image.length;
        int dir[][]={{1,0},{-1,0},{0,-1},{0,1}};
        int n=image[0].length;
        int orig=image[sr][sc];
        image[sr][sc]=color;
        if(orig==color) return image;
        while(!que.isEmpty())
        {
            int curr[]=que.poll();
            
            int r=curr[0];
            int c=curr[1];

            for(int arr[]:dir)
            {
                int nr=r+arr[0];
                int nc=c+arr[1];
                if(nr==-1||nc==-1||nr==m||nc==n||image[nr][nc]!=orig) continue;
                image[nr][nc]=color;
                que.add(new int[]{nr,nc});
            }
        }
        return image;
    }
}