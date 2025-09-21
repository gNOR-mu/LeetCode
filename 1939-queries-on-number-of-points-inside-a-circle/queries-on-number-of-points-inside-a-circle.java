class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            double r2 = queries[i][2]*queries[i][2];
            int inside = 0;
            for (int[] p:points) {
                int x2 = p[0];
                int y2 = p[1];
                long dist = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
                if (dist <= r2) {
                    inside++;
                }
            }
            res[i] = inside;
        }
        return res;
    }
}