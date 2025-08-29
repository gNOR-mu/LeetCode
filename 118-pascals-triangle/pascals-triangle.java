class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    line.add(1);
                } else {
                    var up = res.get(i - 2);
                    line.add(up.get(j - 1) + up.get(j));
                }
            }
            res.add(line);
        }
        return res;
    }
}