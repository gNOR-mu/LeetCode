class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if (Arrays.deepEquals(mat, target)){
            return true;
        }
        rotate(mat);
        if (Arrays.deepEquals(mat, target)){
            return true;
        }
        rotate(mat);
        if (Arrays.deepEquals(mat, target)){
            return true;
        }
        rotate(mat);
        if (Arrays.deepEquals(mat, target)){
            return true;
        }
        return false;
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = tmp;
            }
        }
    }
}