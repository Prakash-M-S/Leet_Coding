class Solution {
    public boolean checkValid(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        HashSet<Integer>[] rowSet = new HashSet[R];
        HashSet<Integer>[] colSet = new HashSet[C];

        for (int i = 0; i < R; i++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
        }

        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                int dig = matrix[row][col];

                if (dig < 1 || dig > R || rowSet[row].contains(dig) || colSet[col].contains(dig)) {
                    return false;
                }
                rowSet[row].add(dig);
                colSet[col].add(dig);
            }
        }
        return true;
    }
}