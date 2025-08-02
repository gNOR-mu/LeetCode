class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = (mat.length & 1) == 1 ? -mat[mat.length / 2][mat.length / 2] : 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i] + mat[mat.length - 1 - i][i];
        }
        return sum;
    }
}