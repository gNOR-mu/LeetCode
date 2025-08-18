class Solution {
    public int countNegatives(int[][] grid) {
        int neg = 0;
        int last = -1;
        int rStart =grid[0].length - 1;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = rStart; j > last; j--) {
                if (grid[i][j] >= 0) {
                    last = j;
                    break;
                }
                neg++;
            }
        }
        return neg;
    }
}