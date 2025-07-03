class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { 
                map.put(mat[i][j], new int[]{i, j});
            }
        }

        int row[]=new int[n];
        int col[]=new int[m];

        for (int i = 0; i < n * m; i++) {
            int r = map.get(arr[i])[0];
            int c = map.get(arr[i])[1];
            row[r]++;
            col[c]++;
            if (row[r] == m || col[c] == n) {
                return i;
            }
        }
        return -1;
    }
}