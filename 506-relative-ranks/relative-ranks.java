class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] res = new String[score.length];
        Map<Integer, Integer> map = new TreeMap<>((a, b) -> b - a);

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        int i = 1;
        for (var v : map.entrySet()) {
            switch (i) {
                case 1 -> res[v.getValue()] = "Gold Medal";
                case 2 -> res[v.getValue()] = "Silver Medal";
                case 3 -> res[v.getValue()] = "Bronze Medal";
                default -> res[v.getValue()] = "" + i;
            }
            i++;
        }
        return res;

    }
}