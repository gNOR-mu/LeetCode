class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Comparator<int[]> comparator = (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(comparator);
        int[][] res = new int[k][2];

        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
        }
        for (int i = 0; i < k; i++) {
            int[] r = pq.poll();
            res[i][0] = r[0];
            res[i][1] = r[1];
        }
        return res;
    }
}