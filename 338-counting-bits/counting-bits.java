class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        if (n == 0) {
            return res;
        }
        for (int i = 1; i < res.length; i++) {
            res[i] = (i & 1) == 0 ? res[i>>1] : res[i - 1] + 1;
        }
        return res;
    }

}