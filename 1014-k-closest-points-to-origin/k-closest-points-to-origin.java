class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if (k == points.length) {
            return points;
        }
        int[][] res = new int[k][2];
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int[] p = points[i];
            map.put(i, Math.sqrt(p[0] * p[0] + p[1] * p[1]));
        }
        var sorted = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .toList();
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Double> entry = sorted.get(i);
            int[] p = points[entry.getKey()];
            res[i][0] = p[0];
            res[i][1] = p[1];
        }
        return res;
    }
}