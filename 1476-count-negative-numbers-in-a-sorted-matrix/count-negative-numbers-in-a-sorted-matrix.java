class Solution {
    public int countNegatives(int[][] grid) {
        int neg = 0;
        for(int i=grid.length-1;i>=0;i--){
            if(grid[i][grid[i].length-1] >=0) break;
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j]<0){
                    neg++;
                }else{
                    break;
                }
            }
        }
        return neg;
    }
}