class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        if ((mat.length & 1) == 1) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i] + mat[mat.length - 1 - i][i];
        }
        return sum;
    }
}