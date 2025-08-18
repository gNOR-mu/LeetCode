class Solution {
    public int countNegatives(int[][] grid) {
        int neg = 0;
        int last = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= last; j--) {
                if (grid[i][j] < 0) {
                    neg++;
                } else {
                    last = j-1;
                    break;
                }
            }
        }
        return neg;
    }
}