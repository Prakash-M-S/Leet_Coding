class Solution {
    public int trapRainWater(int[][] heightMap) {
       int m = heightMap.length, n = heightMap[0].length;
        if (m < 3 || n < 3) return 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        boolean[][] visited = new boolean[m][n];
        int totalWater = 0;

        for (int i = 0; i < m; i++) {
            pq.offer(new int[]{i, 0, heightMap[i][0]});
            pq.offer(new int[]{i, n - 1, heightMap[i][n - 1]});
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }

        for (int j = 0; j < n; j++) {
            pq.offer(new int[]{0, j, heightMap[0][j]});
            pq.offer(new int[]{m - 1, j, heightMap[m - 1][j]});
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int x = cell[0], y = cell[1], height = cell[2];

            for (int[] d : directions) {
                int nx = x + d[0], ny = y + d[1];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
                    totalWater += Math.max(0, height - heightMap[nx][ny]);
                    pq.offer(new int[]{nx, ny, Math.max(height, heightMap[nx][ny])});
                    visited[nx][ny] = true;
                }
            }
        }
        return totalWater; 
    }
}