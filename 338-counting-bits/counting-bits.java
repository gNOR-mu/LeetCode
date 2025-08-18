class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = countBitsNumber(i);
        }
        return res;
    }

    public int countBitsNumber(int n) {
        int bits = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                bits++;
            }
            n >>= 1;
        }
        return bits;
    }
}