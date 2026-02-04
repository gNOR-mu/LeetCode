class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 0){
                    continue;
                }
                int p = 4;
                if (i > 0 && grid[i - 1][j] == 1) {
                    p--;
                }
                if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                    p--;
                }
                if (j > 0 && grid[i][j - 1] == 1) {
                    p--;
                }
                if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                    p--;
                }
                res += p;

            }
        }
        return res;
    }
}