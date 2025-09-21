class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int inside = 0;
            for (int j = 0; j < points.length; j++) {
                double dist = Math.pow(queries[i][0] - points[j][0], 2) + Math.pow(queries[i][1] - points[j][1], 2);
                dist = Math.sqrt(dist);
                if (dist <= queries[i][2]) {
                    inside++;
                }
            }
            res[i] = inside;
        }
        return res;
    }
}